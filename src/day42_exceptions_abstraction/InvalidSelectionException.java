package day42_exceptions_abstraction;

public class InvalidSelectionException extends Exception {
    //beign a subclass of Exception makes this is checked exception

    public InvalidSelectionException(){
        super("Selection can only be 1,2 or 3");
    }

}
