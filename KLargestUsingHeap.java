import java.util.*;

public class KLargestUsingHeap {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        List<Integer> result = findKLargest(arr, k);

        System.out.println("K largest elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    static List<Integer> findKLargest(int[] arr, int k) {
        // Min Heap to keep track of k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the smallest in heap
            }
        }

        // Extract elements and sort in descending order
        List<Integer> result = new ArrayList<>(minHeap);
        result.sort(Collections.reverseOrder());

        return result;
    }
}
