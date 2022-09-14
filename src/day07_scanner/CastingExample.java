package day07_scanner;

public class CastingExample {
    public static void main(String[] args) {
        float averageScore = 20.5F; //20.5 is double by default. so you need to add F
        byte num1 = (byte)averageScore; // byte is smaller than float, so we need to cast
        short num2 =(short) averageScore;// short is smaller than float, so we need to cast
        int num3 = (int) averageScore;// int is smaller than float, so we need to cast
        long num4 = (long)averageScore;// long is smaller than float, so we need to cast
        float num5 = averageScore;
        double num6 = averageScore;








    }




}
