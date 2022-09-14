package day32_arraylist;

import java.util.ArrayList;

public class FlowPrac2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(300);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        //nums.remove(300); //the 300 is an int here, so it ios tryng to remove index 300
        nums.remove((Integer) 300); // 300 is being to cas to Integer, so it will remove the element

        ArrayList<Character> name = new ArrayList<>();
        name.add('g');
        name.add('u');
        name.add('z');
        name.add('e');
        name.add('l');

        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));
        System.out.println(name.get(4));



    }


}
