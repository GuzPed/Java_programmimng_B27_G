package day23_arrays_day2;

public class EvenOrOdd_4 {
    public static void main(String[] args) {

        int[] nums = {3,5,12,12,5,12,4,2};
        int even =0, odd=0;

        for (int each: nums) {
            if (each%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even " + even);
        System.out.println("Odd " + odd);

        int even1=0, odd1=0;

        for (int i=0; i< nums.length;i++) {
            if (nums[i]%2==0) {
                even1++;
            } else {
                odd1++;
            }
        }
        System.out.println("Even " + even1);
        System.out.println("Odd " + odd1);




    }


}
