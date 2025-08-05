class Student1{
    int age;
    String name;
    public void printInfoo(int age)
    {
        System.out.println(age);
    }
    public void printInfoo(String name) {
        System.out.println(name);
    }
    public void printInfoo(String name,int age)
    {
        System.out.println(name +" "+age);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.age = 24;
        s1.name="katik";
        s1.printInfoo(s1.age);
        s1.printInfoo(s1.name);
        s1.printInfoo(s1.name, s1.age);
    }
}
