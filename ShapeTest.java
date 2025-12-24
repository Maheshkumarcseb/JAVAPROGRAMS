public class ShapeTest {

    
    static class Shape {
        {
            System.out.println("Instance block executed of shape class.");
        }
        static {
            System.out.println(" first Static block executed.");
        }

        static {
            System.out.println("Second static block executed.");
        }

        
        public Shape() {
            System.out.println("Constructor executed.");
        }
    }

    
    static class Traingle extends Shape {

       
        {
            System.out.println("Triangle instance block executed.");
        }

        
        static {
            System.out.println("Triangle static block executed.");
        }

        static {
            System.out.println("Second Triangle static block executed.");
        }

        
        public Traingle() {
            System.out.println("Triangle constructor executed.");
        }
    }

    
    public static void main(String[] args)throws ClassNotFoundException {
        System.out.println("Main method started.");
        // Traingle obj1 = new Traingle();
        // Class.forName("ShapeTest");
         Class.forName("ShapeTest$Traingle");
    }
}
