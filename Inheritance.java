class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Area of Triangle: " + (0.5 * l * h));
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class EquilateralTriangle extends Triangle {
    // Optional override since same as Triangle's area()
    @Override
    public void area(int l, int h) {
        System.out.println("Area of Equilateral Triangle: " + (0.5 * l * h));
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();  // Base method

        Triangle triangle = new Triangle();
        triangle.area(10, 5); // Area of Triangle

        Circle circle = new Circle();
        circle.area(7); // Area of Circle

        EquilateralTriangle eqTriangle = new EquilateralTriangle();
        eqTriangle.area(6, 6); // Area of Equilateral Triangle
    }
}
