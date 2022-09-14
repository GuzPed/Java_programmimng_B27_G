package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,9,0,12));
        System.out.println(list);

        list.set(2,10);
        System.out.println(list);

        list.set(0,2);
        System.out.println(list);

        System.out.println("===================================");
        ArrayList<String> str = new ArrayList<>(Arrays.asList("Friday", "off", "study", "java"));

        int indexOfJava = str.indexOf("java");
        str.set(indexOfJava, "coding");

        System.out.println(str);


    }
}
