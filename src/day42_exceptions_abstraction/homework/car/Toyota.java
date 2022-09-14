package day42_exceptions_abstraction.homework.car;

public class Toyota extends  Car{
    /*
    Create a concrete class Toyota
    sub class of Car

    override the start method to print:
        turning key to start
     */

    @Override
    public void start() {
        System.out.println("turning key to start");
    }
}
