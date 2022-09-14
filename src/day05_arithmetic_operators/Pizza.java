package day05_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {
        String type = "Cheese";
        int pizzaSlices = 21;
        int people = 3;

        int slicesPerPerson = pizzaSlices / people;
        int leftOvers = pizzaSlices % people;


        System.out.println(people + " people are going to eat " + type + " pizza. Every person will get " + slicesPerPerson + " and there will be " + leftOvers + " left over. ");






    }



}
