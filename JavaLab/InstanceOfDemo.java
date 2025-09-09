class Creature {}
class Mammal extends Creature {}
class Fish extends Creature {}
public class InstanceOfDemo {
    public static void checkType(Creature c) {
        if (c instanceof Mammal) {
            System.out.println("It's a Mammal!");
        } else if (c instanceof Fish) {
            System.out.println("It's a Fish!");
        } else {
            System.out.println("Unknown creature type.");
        }
    }

    public static void main(String[] args) {
        checkType(new Mammal());
        checkType(new Fish());
        checkType(new Creature()); // Added just to show fallback case
    }
}
