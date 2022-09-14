package day42_exceptions_abstraction;

public class VendingMachine {

    public static String select(int selection){
        String item = "";
        if (selection == 1){
            item = "Chips";
        } else if (selection == 2){
  //          item="Gum";   -> out of stock

            throw new OutOfStockException(); // causes the exception to happen

        } else if (selection ==3){
            item="Cnady";
        }
        return item;
    }


    public static String selectValid(int selection) throws InvalidSelectionException{
        String item = "";
        if (selection == 1){
            item = "Chips";
        } else if (selection == 2){
          item="Gum";
        } else if (selection ==3){
            item="Cnady";
        } else {
            throw new InvalidSelectionException(); // checked exception - must be handled - but i also created this so i don't want to handle myself
        }
        return item;
    }
}
