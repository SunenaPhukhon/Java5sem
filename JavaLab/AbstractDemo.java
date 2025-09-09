abstract class Appliance {
    abstract void start();
}

class Fan extends Appliance {
    @Override
    void start() {
        System.out.println("Fan starts rotating.");
    }
}

class WashingMachine extends Appliance {
    @Override
    void start() {
        System.out.println("Washing Machine starts washing clothes.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance washingMachine = new WashingMachine();

        fan.start();
        washingMachine.start();
    }
}