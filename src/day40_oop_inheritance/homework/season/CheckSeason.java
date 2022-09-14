package day40_oop_inheritance.homework.season;

public class CheckSeason {
    /*
Create a class CheckSeason
create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class
	List the is a relations of all the classes
     */
    public static void main(String[] args) {

        Winter winter = new Winter(45, 55);
        System.out.println(winter);
        System.out.println(winter.activity());

        Summer summer = new Summer(142, 75);
        System.out.println(summer);
        System.out.println(summer.activity());

        Fall fall = new Fall(14536, 5674);
        System.out.println(fall);
        System.out.println(fall.activity());

        Spring spring = new Spring(6767, 430);
        System.out.println(spring);
        System.out.println(spring.activity());

    }



}
