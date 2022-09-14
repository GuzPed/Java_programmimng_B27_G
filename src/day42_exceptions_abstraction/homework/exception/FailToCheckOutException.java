package day42_exceptions_abstraction.homework.exception;

public class FailToCheckOutException extends Exception{
    /*
     create a constructor to accept the String argument and pass it to the super constructor
     */

    public FailToCheckOutException(String str){
        super(str);
    }
}
