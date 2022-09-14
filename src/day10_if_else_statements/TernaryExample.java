package day10_if_else_statements;

public class TernaryExample {
    public static void main(String[] args) {
        int score = 50;
        if (score >70) {
            System.out.println( "passing");
        } else {
            System.out.println( "failing");
        }

        System.out.println("_______________________");

        String result = score > 70 ? "passing" : "failing";
        System.out.println(result);
        System.out.println("_______________________");

        int n = 9;
        System.out.println(n%2==0? "even" : "odd");
        System.out.println("_______________________");

        boolean  isGreen = true;
        System.out.println( isGreen ? "Drive " : "Stop");
        System.out.println("_______________________");

        int b = -59999;
        System.out.println( b>0? "positive" :  b < 0? "Negative" : "Zero" );





    }


}
