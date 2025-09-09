public class Student {
    String name;
    int id;
    float marks;

    void inputDetails(String n, int i, float m) {
        name = n;
        id = i;
        marks = m;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetails("Sunena", 101, 88.5f);
        s1.displayDetails();
    }
}
