package day27_multi_array_methods;

public class Marge {
    public static void main(String[] args) {
        int[][] nums = {
                {10,20,30},
                {5,10,15},
                {1,2,3}
        };
        //nums.length ==2
        //nums[0].length+nums[1].length

        //i need to count the total number of elements, we will use the loop
        int size=0;
        for(int[] eachArray: nums) {
            size+=eachArray.length;
        }

        int[] merged = new int[size];
        int indexToStore = 0;
        for (int[] eachArray: nums) {
            for (int eachNum: eachArray) {
                merged[indexToStore] = eachNum;
                indexToStore++;
            }
        }




    }
}
