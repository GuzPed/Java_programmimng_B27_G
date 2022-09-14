package day22_arrays_day1;

public class FirstArray {
    public static void main(String[] args) {

        int[] nums; // declaring an int array
        nums = new int [5]; // intializing the array with 5 spaces. default 0 values - [0,0,0,0,0]
                                                                                    //  0 1 2 3 4
        System.out.println(nums[0]); // access one element, the fisrt element

        // change the first element to be 10
        nums[0] = 10; // assigning the value 10 in the position 0 of the array

        System.out.println(nums[0]);

        nums[3] = 25;

        System.out.println(nums[3]);  // at this point the array: [10, 0, 0, 25, 0]

        //delaring and initializing with the values
        int[] other = {5,7,10,-8,20,12};  //as many as i want
        System.out.println(other[1]);
        System.out.println(other[4]);
     //   System.out.println(other[100]);  // error ArrayIndexOutOfBoundsException:  - index does not exist









    }

}
