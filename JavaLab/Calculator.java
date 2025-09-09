public class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.multiply(5, 4));
        System.out.println(c.multiply(2.5, 3.5));
    }
}
