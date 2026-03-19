interface SmartDevice 
{
    void turnOn();
    void turnOff();
}

class Fan implements SmartDevice {

    public void turnOn() {
        System.out.println("turned ON the fan");
    }

    public void turnOff() {
        System.out.println("turned OFF the fan");
    }
}

class Light implements SmartDevice {

    public void turnOn() {
        System.out.println("turned ON the light");
    }

    public void turnOff() {
        System.out.println("turned OFF the light");
    }
}

class AirConditioner implements SmartDevice {

    public void turnOn() {
        System.out.println("turned ON the AC");
    }

    public void turnOff() {
        System.out.println("turned OFF the AC");
    }
}

public class HomeAppliance {
    public static void main(String[] args) {
        SmartDevice a1 = new Fan();
        a1.turnOn();
        a1.turnOff();

        SmartDevice a2 = new Light();
        a2.turnOn();
        a2.turnOff();

        SmartDevice a3 = new AirConditioner();
        a3.turnOn();
        a3.turnOff();



    }
}
