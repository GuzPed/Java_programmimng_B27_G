package day10_if_else_statements;

public class SimpleCalculator {
    public static void main(String[] args) {
        double a = 31;
        double b = 2;
        char operator = '/';
        double result = 0;

        if (operator == '+'){
            result = a+b;
        } else if (operator == '-') {
            result = a-b;
        } else if (operator == '*' || operator == 'x') {
            result = a*b;
        } else if (operator == '/') {
            result = a/b;
        } else {
            System.out.println( "invalid operator");
        }
        System.out.println("" + a + operator + b + " = " + result );

    }
}
