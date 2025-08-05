
class Pen
{
    Pen()
    {
        System.out.println("this is constuctor of pen");
    }
    String color;
    String type;
    public void write(){
        System.out.println("writing notes");
    }
    public void printColor()
    {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void info()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student()
    {
//        System.out.println("constructor of Student class");
//        this.name=name;
//        this.age = age;
//
    }


    Student(Student s2){
        this.name =s2.name;
        this.age =s2.age;
    }
}
public class ClassObjectDemo {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color ="black";
        pen2.type="ball point";

        pen1.printColor();
        pen2.printColor();


        Student s1  = new Student();
        s1.name  ="kartik";
        s1.age = 20;
        s1.info();
        Student s2 = new Student(s1);
        s1.info();

    }
}
