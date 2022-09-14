package day26_multi_array;

public class Homework_3 {
    public static void main(String[] args) {
        /*
        [Difficult, don't spend too much time on it]

Write a program that can print out the common elements from each inner element of a 2D
array

Ex:
       int[][] arr {
              {4, 1, 24, 5},
              {24, 1, 5, 2},
              {4, 1, 5, 1}
       }
         */

//        int[][] arr = {
//            {4, 1, 24, 5},
//            {24, 1, 5, 2},
//            {4, 1, 5, 1},
//        };
//        String number= "";
//
//        for (int i = 0; i<= arr.length-2; i++){
//            for (int j=0; j< arr[i].length; j++) {
//                for (int k=0; k <arr[i].length; k++) {
//                   // if (!number.contains(""+ arr[i][j])) {                         // if i need output [1,4,5,24]
//                    if (arr[i][j] == arr[i+1][k] && arr[i][j] == arr[i+2][k]) {         // to change && to ||
//                    number+= " " + arr[i][j];
//                }
//           // }
//                }}}
//        System.out.println(number);   // output 1 and 5
//
//        System.out.println("=============================================");

        int[][] arr = {
                {4, 1, 24, 5},
                {24, 1, 5, 2},
                {4, 1, 5, 10},
                {4, 1, 5, 1,8, 9,10}
        };
        String number= "";

        int i=0;
        while (i == 0){                                     //as a default = first 1d array
            for (int j=0; j< arr[i].length; j++) {          // will take each element of first 1d array
                for (int k=0; k <arr[i].length; k++) {

                    if (arr[i][j] == arr[i+1][k] && arr[i][j] == arr[i+2][k]) {
                        number+= " " + arr[i][j];
                    }
                }}}
        System.out.println(number);   // output 1 and 5





        }


    }

