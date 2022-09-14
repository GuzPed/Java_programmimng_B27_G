package day26_multi_array;

import java.util.Arrays;

public class GentiSolutionForCommonTask {
    public static void main(String[] args) {

        int[][] arr = {{7, 24, 15, 1, 12, -5, 5, 2, 7},
                       {28, 15, 12, -5, 24},
                        {4, 1, 89, 15, 5, 12, 17, -5, 78}};
        int num = 0, count = 0;
        String common = "";


        for (int i = 0; i < 1; i++) {   // {24, 15, 1, 12, -5, 5, 2},

            for (int j = 0; j < arr[i].length; j++) {  //{24, 15, 1, 12, -5, 5, 2} each element one by one
                num = arr[i][j];  //15
                count = 0;

                for (int k = 1; k < arr.length; k++) {  /// {28, 15, 12, -5, 24},
                                                         // {4, 1, 89, 15, 5, 12, 17, -5, 78}};

                    Arrays.sort(arr[k]);      //{4, 1, 89, 15, 5, 12, 17, -5, 78}};
                    int a = Arrays.binarySearch(arr[k], num); //  int a = Arrays.binarySearch ({4, 1, 89, 15, 5, 12, 17, -5, 78}};, 15)
                    if (a >= 0) {  //    true
                        count++;  // 1 +1

                    }
                    if (count == arr.length - 1) {  //  2==2
                        common += num + " "; // 15
                    }
                }
            }
        }
        String[] commonArray = common.trim().split(" ");
        System.out.println("Elements common on array are: " + Arrays.toString(commonArray));
    }
}