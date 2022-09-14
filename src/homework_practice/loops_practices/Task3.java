package homework_practice.loops_practices;

public class Task3 {
    public static void main(String[] args) {
        /*
        factorial number 5
         */

        int number =5;
        int mult =1;

        while (number>0 ) {
            mult *=number;

            number--;
        }
        System.out.println(mult);
    }


}
