package day37_custom_classes_static.cydeo;

import day37_custom_classes_static.Coffee;

import java.util.Arrays;

public class CydeoStudent {

    //instance variables
    String name;
    String city;
    int group;
    Coffee myCoffee;

    //static variables
    static int batchNumber;
    static String schoolName;
    static String[] instructors;  // static  means one copy, belongs to class, all object share. String[] type


    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String[]{"Adam", "Asiya", "Saim"}; // created a new String array and assigned into the instructors reference
    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(16);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }

    public static void schoolInfo() {
        System.out.println(schoolName + " Batch " + batchNumber);
        System.out.println("Instructors: " + Arrays.toString(instructors));
    }

    public void drink(){
        myCoffee.amountLeft -=2;
    }



}
