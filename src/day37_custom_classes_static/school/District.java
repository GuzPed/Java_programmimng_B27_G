package day37_custom_classes_static.school;

public class District {
    public static void main(String[] args) {
        School.district = 149;
        School.totalStudents = 3000;
        School.totalTeachers = 100;

        School.totalTeachers--;

        System.out.println(School.district);
        System.out.println(School.totalStudents);
        System.out.println(School.totalTeachers);

        School.announcement();

        //School.lunch(); lunch() method is instance

        School middle = new School();
        middle.lunchtime = 12;
        //School.lunchTime;
        middle.lunch();




    }




}
