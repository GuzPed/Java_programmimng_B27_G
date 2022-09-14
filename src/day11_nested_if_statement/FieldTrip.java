package day11_nested_if_statement;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 6;
        String location = "";
        String techer = " ";
        int numberOfGroups = 0;

        if (grade >0 && grade <=6) {
            if (grade == 1) {
                location = "Apple Orchard";
                techer = "Ms Smith";
                numberOfGroups = 5;
            } else if (grade ==2){
                location = "Zoo";
                techer = "Ms Bomd";
                numberOfGroups = 8;
            } else if (grade ==3){
                location = "Aquarium";
                techer = "Ms KKK";
                numberOfGroups = 2;
            } else if (grade ==4){
                location = "Museum";
                techer = "Ms Gaga";
                numberOfGroups = 6;
            }    else if (grade ==5){
                location = "Movies";
                techer = "Ms Ariel";
                numberOfGroups = 4;
            } else if (grade ==6){
                location = "Six flags";
                techer = "Ms Maria";
                numberOfGroups = 3;
            }
            System.out.println(" " + location + techer + numberOfGroups);

            System.out.println();
        } else {
            System.out.println("invalid number");
        }




    }

}
