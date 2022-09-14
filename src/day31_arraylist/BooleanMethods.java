package day31_arraylist;

import java.util.ArrayList;

public class BooleanMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("is empty -"+list.isEmpty()); //true
        list.add(4);
        list.add(6);
        list.add(49);
        list.add(8);
        list.add(3);
        list.add(455);
        System.out.println(list);
        System.out.println("is empty -" + list.isEmpty()); //false

        System.out.println("contains 49 - " + list.contains(49)); //true
        System.out.println("contains 5000 - " + list.contains(5000)); //false
        System.out.println("contains 1 -" + list.contains(1)); //false


        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("is empty -"+list2.isEmpty()); //true
        list2.add(4);
        list2.add(6);
        list2.add(49);
        list2.add(8);
        list2.add(3);
        list2.add(455);

        System.out.println("equals  -" + list.equals(list2)); // true
        list2.remove(0);
        System.out.println("equals  -" + list.equals(list2)); // false

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(2);
        list4.add(1);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list3.equals(list4));

    }
}
