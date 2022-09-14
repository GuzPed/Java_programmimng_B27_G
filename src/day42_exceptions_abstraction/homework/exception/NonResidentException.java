package day42_exceptions_abstraction.homework.exception;

public class NonResidentException extends RuntimeException{
    /*
        create a constructor to accept the String argument and pass it to the super constructor
     */
    public NonResidentException(String str){
        super(str);
    }

}
