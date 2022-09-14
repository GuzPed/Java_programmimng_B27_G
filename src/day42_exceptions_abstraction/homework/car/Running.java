package day42_exceptions_abstraction.homework.car;

public class Running {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.charge();

        new Toyota().start();

        new BMW().start();



    }
}
