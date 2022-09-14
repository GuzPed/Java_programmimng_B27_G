package day41_exceptions;

public class MultipleSleep {
    public static void main(String[] args) throws InterruptedException{// accepting if the exception happens stom my program

        System.out.println("Hello");

        Thread.sleep(3000);
        System.out.println("Second line");

        Thread.sleep(3000);
        System.out.println("Middle line");

        Thread.sleep(3000);

        System.out.println("Bye");


    }
}
