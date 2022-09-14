package day11_nested_if_statement;

public class ArmyQualifications {
    public static void main(String[] args) {
        int age = 19;
        boolean hasDiploma = true;
        boolean isCitizen = true;

        if ((age>=18 && age<=35) && hasDiploma &&isCitizen) {
            System.out.println("you qualify for the Army");
        } else {
            if (age <0 || age >120) {
                System.out.println( "Not a valid age number");
            } else if (age<18) {
                System.out.println("you are too young");
            } else {
                System.out.println("you are too old");
            }

            if (!hasDiploma){
                System.out.println("you need a highschool diploma");
            }
            if (!isCitizen) {
                System.out.println(" you need to be a citizen");
            }

        }




    }

}
