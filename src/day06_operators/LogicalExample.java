package day06_operators;

public class LogicalExample {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isGoTemp = true;
        boolean doBbq = isWeekend && isGoTemp;
        System.out.println("doBbq = " + doBbq);


        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFireFighter = false;
        boolean getDiscoubt = isFireFighter || isPolice || isTeacher;
        System.out.println("getDiscoubt = " + getDiscoubt);

        System.out.println("=============");

        int number = 8;
        System.out.println( number > 5 && number < 10); //  true && true ==> true

        System.out.println(number > 0 && number < 5); // true && false ==> false

        System.out.println("=============");

        int age = 40;
         boolean isInValidAge = age < 0 || age >120; // false || false
        System.out.println(isInValidAge);

        boolean isInValidAge1 = age < 0 || age <120; // false || true
        System.out.println(isInValidAge1);





    }
}
