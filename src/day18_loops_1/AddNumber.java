package day18_loops_1;

public class AddNumber {
    public static void main(String[] args) {
        //write a program that will add all the numbers from 1 - 500
        int limit = 500;
        int count  = 1;
        int sum =0;

        while (count<=limit) {                   // 1 <=500 500<=500
            sum+=count;                          // add all the numbers sum = count +count  = ((1+ 2) +3) +4
            count++;                            //2 ->3 - > 4 ->5
        }

        System.out.println(sum);

 // 1+2+3+4+...+499+500 = sum
    }
}
