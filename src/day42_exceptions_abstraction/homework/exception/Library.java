package day42_exceptions_abstraction.homework.exception;

public class Library {
    /*
    Create a class Library
    create a method getLibraryCard(String city)
        if the city is Fairfax or McLean print Library Card Created
        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call
    create a method borrow(boolean checkedOut)
        if the given checkedOut boolean is true print "Enjoy reading"
        but if the boolean is false throw your FailToCheckOutException
        -> handle this exception in the runner file
     */

    public void getLibraryCard(String city) {
        if (city.equalsIgnoreCase("Fairfax") || city.equalsIgnoreCase("McLean") ){
            System.out.println("Library Card Created");
        } else {
            throw new NonResidentException("Should be Fairfax or McLean ");
        }
    }

    public void borrow(boolean checkedOut) throws FailToCheckOutException{
        if (checkedOut){
            System.out.println("Enjoy reading");
        } else {
            throw new FailToCheckOutException("something wrong");
        }

    }


}
