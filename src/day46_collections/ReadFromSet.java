package day46_collections;

import java.util.*;

public class ReadFromSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);

        System.out.println(set);

      //  set.get();  // there is no get method, so you need to run a loop to access the elements

        for(int each: set){
            if (each > 10){
                System.out.println(each);
            }
        }
        
        Set<String> handles = new HashSet<>();
        handles.add("sdfdrgbfd54g64634");
        handles.add("dfgbvfvgb5464687336");

        for(String each: handles){
            if(!each.equalsIgnoreCase("sdfdrgbfd54g64634")){
                //switch to the other handle
            }
        }

        Set<String> set3 = new HashSet<>();
        set3.add("hello");
        set3.add("bye");
        set3.add("java");
        set3.add("world");
        System.out.println(set3);

        List<String> list = new ArrayList<>(set3);
        System.out.println(list);
        System.out.println(list.get(0));

        //remove duplicate occurrences of each letter
        String s = "AAAABBBBBBBBCCCDDDDDDDD";
       System.out.println(new LinkedHashSet<>(new ArrayList<>(Arrays.asList(s.split("")))).toString().replace(",", "").replace("[", "").replace("]",""));








    }
}
