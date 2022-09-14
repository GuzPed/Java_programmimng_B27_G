package day43_abstraction.car;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("Key car is near by to start the car");
    }

    @Override
    public void charge() {
        System.out.println("tesla charging station");

    }
}
