@java.lang.FunctionalInterface
interface A
{
    void show();

}
//class B implements A
//{
//    public void show()
//    {
//        System.out.println("in class B");
//    }
//
//}
public class FunctionalInterface {
    public static void main(String[] args) {
        A obj =()-> System.out.println("i am in show inner class");
//        A obj = new A(){
//            public void show()
//            {
//                System.out.println("i am in show inner class");
//            }
//
//        };
        obj.show();
    }
}
