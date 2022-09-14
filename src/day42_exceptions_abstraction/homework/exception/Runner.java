package day42_exceptions_abstraction.homework.exception;

public class Runner {
    /*
    Create a class to run the code by calling the methods and seeing the result with different inputs to see how the exceptions were related to the execution
     */

    public static void main(String[] args) {

        new Library().getLibraryCard("Fairfax");

      // new Library().getLibraryCard("Fairfaxdgfgdfr");


        try {
           new Library().borrow(false);
        }catch (FailToCheckOutException e){
            System.err.println(e.getMessage());
        }
    }
}
