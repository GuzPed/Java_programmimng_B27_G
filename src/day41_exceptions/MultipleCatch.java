package day41_exceptions;

public class MultipleCatch {
    public static void main(String[] args) {

        try {
            System.out.println(1/5);
            String s = null;
            s.trim();

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Secpnd catch block " );
            e.printStackTrace();
        }
        System.err.println("hello");
        System.out.println("END");
/*
 try {
            System.out.println(1/5);
            String s = null;
            s.trim();

        } catch (ArithmeticException | NullPointerException e) {// it does not make sense in this example, better to separate
            System.out.println(e.getMessage());
        }
 */

    }
}
