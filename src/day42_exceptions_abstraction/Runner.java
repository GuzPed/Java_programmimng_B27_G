package day42_exceptions_abstraction;

public class Runner {
    public static void main(String[] args) {
        System.out.println(VendingMachine.select(1));

        //this method has un checked exception - normally these exception are not handled

        try {
            System.out.println(VendingMachine.selectValid(5));
        } catch (InvalidSelectionException e){
            System.out.println(e.getMessage());
        }


    }
}
