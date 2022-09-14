package day42_exceptions_abstraction.homework.car;

public class BMW extends Car{
    /*
 Create a concrete class BMW
    sub class of Car

    override the start method to print:
        pressing button to start
     */

    @Override
    public void start() {
        System.out.println(" pressing button to start");
    }
}
