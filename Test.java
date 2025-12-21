class Test {

    // Static variable
    static int a;

    // Instance variable
    int b;

    //  Static Block
    static {
        a = 100;
        System.out.println("Static block executed");
    }

    //  Instance Block
    {
        b = 200;
        System.out.println("Instance block executed");
    }

   
    Test() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Main method started");

        // Load class explicitly
        Class.forName("Test");

        System.out.println("Creating first object");
        Test obj1 = new Test();

        System.out.println("Creating second object");
        Test obj2 = new Test();
    }
}
