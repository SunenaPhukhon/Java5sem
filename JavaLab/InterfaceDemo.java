interface Drawable {
    void draw();
}

class CircleShape implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable circle = new CircleShape();
        Drawable square = new Square();

        circle.draw();
        square.draw();
    }
}