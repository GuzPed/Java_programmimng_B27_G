package day10_if_else_statements;

public class Retake {
    /*
    declare and assign a grade variable
declare and assign an attempt number

Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%

Based on the retake attempt number calculate the final grade
     */
    public static void main(String[] args) {
        double grade = 50;
        int attemptNumber = 7;
        double finalGrade =0;

        if (attemptNumber==1) {
            finalGrade = grade -grade *0.1;
        } else if (attemptNumber==2) {
            finalGrade = grade - grade*0.2;
        } else if (attemptNumber==3) {
            finalGrade = grade - grade*0.35;
        } else {
            System.out.println("you are stupid");
        }
        System.out.println("Your number of attempt is " + attemptNumber);
        System.out.println("Your final grade is " + finalGrade);





    }
}
