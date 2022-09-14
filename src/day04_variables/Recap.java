package day04_variables;

public class Recap {
    public static void main(String[] args) {
        // declare variable
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillsDays;

        // assign value to variables
        temperature = 75.55;
        numberOfJavaDays = 4;
        numberOfSoftSkillsDays = 2;

        System.out.println(temperature + " Celsius ");
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays);
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);

        //declare and assign at te same time
        int numberOfCoffeeCups = 10;
        float ratingOfMovie = 8.9F; // compiler takes 8.9 as double type, we need to add F at the end to make it float type
        long waterInOcean = 2_000_000_000_000_000_000L; // compiler takes as int type, we need to put L to make it Long type
        System.out.println("waterInOcean = " + waterInOcean + " liters ");
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("numberOfCoffeeCups = " + numberOfCoffeeCups);




    }

}
