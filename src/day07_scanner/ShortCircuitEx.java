package day07_scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {
        System.out.println(true && true); // true
        System.out.println(false && true); // false
        //System.out.println(5/0);  you CAN not divide by 0

        //System.out.println( true && 5/0 == 0);
        System.out.println( false && 5/0 == 0); // if the first one is false, the code will not run second option

        int count = 0;
        System.out.println(true || count++ ==1); // count++ ==1 - it's not gonna run, because we have true in the first part. and if we know already the result, so it will not run other part.
        System.out.println(count); // will be o, BECAUSE the system will not run second part, so the varuable will not be reassigned!!!!!!!!!

        int num1 = 5;
        double num2 = 3.5;
        float num3 = 5.5F;
        long num4 = 4;
        short num5= 1;
        byte num6 = 5;
        int num7 = num5*num6;
        System.out.println(num7);
        float num8 = num3*num4;
        double num9 = num1*num2;



        System.out.println(num1*num1);
        System.out.println(num1*num2);
        System.out.println(num3*num4);
        System.out.println(num5*num6);





    }


}
