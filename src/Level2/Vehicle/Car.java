package Level2.Vehicle;

public class Car implements IVehicle{

    private double fuelInLiters = 0;

    public Car(){
    }

    public void drive(){
        System.out.println("Driving car");
    }

    public void refuel(double fuel){
        fuelInLiters += fuel;
    }
}
