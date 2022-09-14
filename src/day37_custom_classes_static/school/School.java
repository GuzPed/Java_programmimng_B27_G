package day37_custom_classes_static.school;

public class School {

    public int lunchtime;
    public static int district;
    public static int totalTeachers;
    public static int totalStudents;


    public static void announcement() {
        System.out.println("announcement to whole distract");
    }

    public void lunch(){
        System.out.println("Lunch is at " + lunchtime);
    }

}
