package day29_methods;

public class VarArgEx {
    public static void main(String[] args) {

        int[] a = {3,1,3,5};
        printAll(a);
        System.out.println();

        // dynamic(a);  it works
        dynamic(4,1,4,1,5,2);
        System.out.println();

        dynamic("mama", "papa", "me");
    }

    public static void printAll (int[] nums) {
        for (int each: nums) {
            System.out.print(each + " ");
        }
    }

    public static void dynamic(int ... nums) {
        for (int each: nums) {
            System.out.print(each + " ");
        }
    }

    public static void dynamic(String ... words) {
        for (String each: words) {
            System.out.print(each + " ");
        }
    }

}
