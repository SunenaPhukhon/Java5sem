public class Shape {
    void area() {
        System.out.println("Area");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area");
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Triangle area");
    }
}

class Rectangle1 extends Shape {
    void area() {
        System.out.println("Rectangle area");
    }
}

class Test {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(); s.area();
        s = new Triangle(); s.area();
        s = new Rectangle1(); s.area();
    }
}
