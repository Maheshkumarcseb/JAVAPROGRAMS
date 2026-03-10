import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class CloneGraph {
    private HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node cloneNode = new Node(node.val, new ArrayList<>());
        visited.put(node, cloneNode);

        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;
    }

    
    public void printGraph(Node node, HashMap<Integer, Boolean> seen) {
        if (node == null || seen.containsKey(node.val)) return;
        
        seen.put(node.val, true);
        System.out.print("Node " + node.val + " neighbors: ");
        for (Node n : node.neighbors) {
            System.out.print(n.val + " ");
        }
        System.out.println();
        
        for (Node n : node.neighbors) {
            printGraph(n, seen);
        }
    }

    public static void main(String[] args) {
        // 1. Create nodes for a graph: 1 <-> 2, 2 <-> 3, 3 <-> 4, 4 <-> 1
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // 2. Define neighbors (Example 1: [[2,4],[1,3],[2,4],[1,3]])
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        
        CloneGraph sol = new CloneGraph();
        Node clonedHead = sol.cloneGraph(node1);

        
        System.out.println("Original Graph structure:");
        sol.printGraph(node1, new HashMap<>());
        
        System.out.println("\nCloned Graph structure:");
        sol.printGraph(clonedHead, new HashMap<>());
        
        
        System.out.println("\nMemory Check: Are they the same object? " + (node1 == clonedHead));
    }
}