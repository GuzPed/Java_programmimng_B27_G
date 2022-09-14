package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("friday", "java", "summer", "coding", "java", "summer", "java"));
        System.out.println(searchInList(list2, "java"));
        System.out.println(searchInList(list2, "friday"));
        System.out.println(searchInList(list2, "summer"));

        //testing the EasyData
        ArrayList<String> days = EasyData.getDaysOfWeek();
        System.out.println(days);

    }

    public static int searchInList (ArrayList<String> list, String target){
        int count = 0;
        for (String each: list) {
            if (each.equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;

    }




}
