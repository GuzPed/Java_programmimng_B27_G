package day36_custom_classes_constructor.food;

import java.util.Arrays;

public class Kitchen {
    /*
    Create a separate class to create and test the Food objects
    	try making an array of Food objects
    	find all the Food objects that start with 'a' and print the whole information
    	find all the Food objects that have a total price over 20 and print the name of the food
     */

    public static void main(String[] args) {
        Food[] allFood = new Food[5];
        System.out.println(Arrays.toString(allFood));
        Food apples = new Food("Apples");
        allFood[0] = apples; // sttoring the Food object, apples, into the food array
        allFood[1] = new Food("Sushi", 10);
        allFood[2] = new Food("Cajun pasta", 2, 3.99);
        allFood[3] = new Food("kebab", 5, 2.5);
        allFood[4] = new Food("Plov", 4, 2.99);

        System.out.println(Arrays.toString(allFood));

        System.out.println("=========================================");
        //print each food object ina separate line

        for (Food each:allFood){
            System.out.println(each);
        }

        //find all the food objects start with A, C and print the whole info
        System.out.println("Food starts with 'A or 'C'");
        for (Food each: allFood) {
            if (each.name.startsWith("A") || each.name.startsWith("C")){
                System.out.println(each);
            }
        }

        System.out.println("Food with price over $7");
        for (Food each: allFood){
            if (each.totalPrice >=7){
                System.out.println(each.name);
            }
        }









    }



}
