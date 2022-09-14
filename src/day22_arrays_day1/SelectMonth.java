package day22_arrays_day1;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};

        System.out.println("Ennter the number of month");
        int num = input.nextInt();
        if (num>0 &&  num<13) {
            System.out.println(months[num-1]); // to conver the input number to a month index we can substract by 1 which means if the number was 1 -->1 1-1 = 0 which means index 0 value will be returned

        } else {
            System.out.println("invalid month number. Should be 1-12");
        }
//3 --> match --> months[2]

//5 --> may --> months[4]






    }
}
