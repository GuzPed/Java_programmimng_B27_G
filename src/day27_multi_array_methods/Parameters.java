package day27_multi_array_methods;

public class Parameters {
    public static void greeting (String name){

        System.out.println("Hello " + name);
        System.out.println("Nice to meet you " + name);
    }

    public static void age(int birthYear) {
        System.out.println(" You are " + (2022-birthYear) + " years old");
    }

    public static void main(String[] args) {
        greeting("Guzel");  //guzel - is an argument, value of the name of method
        System.out.println();
        greeting("Pedro");


        age(1989);
    }





}
