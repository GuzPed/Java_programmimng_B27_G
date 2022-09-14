package day22_arrays_day1;

import java.util.Arrays;

public class Cities {
    public static void main(String[] args) {
        //Cities as seperate String variables
        String city1 = "Chicago";
        String city2 = "West Palm";
        String city3 = "Miami";
        String city4 = "New York";
        String city5 = "Toronto";
        String city6 = "Houston";

        //make an array to store the cities
        String[] cities ={"Chicago","West Palm","Miami","New York", "Toronto","Houston"};

        //access and print each city ane at the time
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);

        //how to print the whole array
        System.out.println(cities);  // an error - not readable info, hash
        Arrays.toString(cities); // will return array object as a String format
        System.out.println(Arrays.toString(cities));






    }
}
