abstract class Appliance {

    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Appliance {

    void turnOn() {
        System.out.println("Fan is turned ON");
    }

    void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}

class WashingMachine extends Appliance {

    void turnOn() {
        System.out.println("Washing Machine is turned ON");
    }

    void turnOff() {
        System.out.println("Washing Machine is turned OFF");
    }
}

public class Machine {
    public static void main(String[] args) {

        Appliance a1 = new Fan();
        a1.turnOn();
        a1.turnOff();

        Appliance a2 = new WashingMachine();
        a2.turnOn();
        a2.turnOff();
    }
}