package day42_exceptions_abstraction.homework.car;

public class Tesla extends ElectricCar {
/*
Create a concrete class Tesla
     sub class of ElectricCar

    override the start method to print:
        key card near by, starting car

    override the charge method to print:
        at tesla charging station
 */

    @Override
    public void start() {
        System.out.println("key card near by, starting car");
    }

    @Override
    public void charge() {
        System.out.println("at tesla charging station");
    }
}
