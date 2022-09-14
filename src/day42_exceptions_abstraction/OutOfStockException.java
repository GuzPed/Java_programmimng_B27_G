package day42_exceptions_abstraction;

public class OutOfStockException extends RuntimeException{ // we create unchecked exception

    public OutOfStockException(){
        super("Item is out of stock");
 // this hepls us to define the message of the exception
        }





}
