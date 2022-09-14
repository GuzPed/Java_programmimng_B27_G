package day11_nested_if_statement;
/*
Create a class called GradeLevel, Given a number grade level
determine and print which school type someone is in.
grade level and types are:

	any number less than 1 or more than 18 is not valid
	1-5: Elementary school
	6-8: Middle school
	9-12: High school
	13-16: College
	17-18: Grad School
 */
public class Gradelevel {
    public static void main(String[] args) {
        int a = 16;

        if (a>1 && a<=18){
            if (a>=1 && a<=5) {
                System.out.println("Elementary school");
            } else if (a>=6 && a<=8) {
                System.out.println("Middle school");
            } else if (a>=9 && a<=12) {
                System.out.println("High school");
            } else if (a>=13 && a<=16) {
                System.out.println("College");
            } else {
                System.out.println("Grad School");
            }

        } else {
            System.out.println("it is not valid");
        }



    }


}
