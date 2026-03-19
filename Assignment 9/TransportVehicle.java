interface Vehicle 
{
    void startEngine();
    void stopEngine();  
}

class Car implements Vehicle
{
   public void startEngine()
    {
        System.out.println("Car engine started");
    }

    public void stopEngine()
    {
        System.out.println("car engine stopped");

    }
}

class Bike implements Vehicle
{
   public void startEngine()
    {
        System.out.println("Bike engine started using self kick");
    }

    public void stopEngine()
    {
        System.out.println("Bike engine stopped");

    }
}

class Truck implements Vehicle
{
   public void startEngine()
    {
        System.out.println("Truck engine started");
    }

    public void stopEngine()
    {
        System.out.println("Truck engine stopped");

    }
}

public class TransportVehicle {
    public static void main(String[] args) {
        
        Vehicle v1= new Car();
        v1.startEngine();
        v1.stopEngine();

        Vehicle v2=new Bike();
        v2.startEngine();
        v2.stopEngine();

        Vehicle v3 = new Truck();
        v3.startEngine();
        v3.stopEngine();
    }
}
