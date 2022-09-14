package day30_methods_practice_wrapper.homework;

import java.util.Arrays;

public class Task2 {
    /*
       HTML Generator
Given a String in the following format take the number part of the generator the html tags.
   Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^
   Ex:
       Input:
           div^2
       Output:
           <div></div> <div></div>
   Ex:
       Input:
           li^3
       Output:
           <li></li><li></li><li></li>
        */
    public static void main(String[] args) {
        String s = "div^2";
        System.out.println(html(s));
        System.out.println(html2(s));
    }

    public static String html(String s) {

        String[] arr = s.split("\\^");

       int num = Integer.parseInt(arr[1]);
        String result = "";

        for (int i=0; i < num; i++ ) {
            result += "<"+arr[0]+">"+"</"+arr[0]+">";
        }
        return result;
    }

    public static String html2(String s){
        int index = s.indexOf("^");

        int num = Integer.parseInt(s.substring(index+1));
        String result="";

        for (int i=0; i < num; i++ ) {   // String repeat method
            result += "<"+s.substring(0,index)+">"+"</"+s.substring(0,index)+">";
        }
        return result;
    }

}
