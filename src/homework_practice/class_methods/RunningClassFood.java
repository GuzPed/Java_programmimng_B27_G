package homework_practice.class_methods;

import java.util.Arrays;

public class RunningClassFood {
     /*
    Create a separate class to create and test the Food objects

    	try making an array of Food objects
    	find all the Food objects that start with 'a' and print the whole information
    	find all the Food objects that have a total price over 20 and print the name of the food
     */

    public static void main(String[] args) {

        Food[] grocery = new Food[5];
        grocery[0] = new Food("Apples");
        grocery[1] = new Food ("Banana", 5);
        grocery[2] = new Food ("Orange", 10, 2.99);
        grocery[3] = new Food ("Bread", 2, 2.99);
        grocery[4] = new Food ("Ice Cream", 2, 0.99);


        System.out.println(Arrays.toString(grocery));

        for (int i=0; i< grocery.length; i++){
            if (grocery[i].name.startsWith("B")){
                System.out.println(grocery[i]);
            }}

            for (int i=0; i< grocery.length; i++){

            if (grocery[i].totalPrice>10) {
                System.out.println("if total more than 10");
                System.out.println(grocery[i].name);
            }
        }









    }






}
