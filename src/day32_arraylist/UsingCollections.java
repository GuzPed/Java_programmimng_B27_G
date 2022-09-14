package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(162, 429, 188, 45, 182, 466, 853, 501, 837, 751));

        System.out.println("MAX - " + Collections.max(list));
        System.out.println("MIN - " +Collections.min(list));

        System.out.println("BEFORE - " + list);
        Collections.sort(list);
        System.out.println("AFTER - " + list);

        System.out.println("2nd max:  " + list.get(list.size()-2));
        System.out.println("2nd min:  " + list.get(1));

        //alternative:  list.remove(Collections.max(list))
        // then to use again Collections.max(list);


        Collections.shuffle(list);
        System.out.println(list);




    }


}
