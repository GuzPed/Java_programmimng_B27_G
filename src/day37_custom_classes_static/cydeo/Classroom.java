package day37_custom_classes_static.cydeo;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        CydeoStudent.schoolInfo();

        CydeoStudent kaka = new CydeoStudent("Kaka", "New York", 9);
        System.out.println(kaka);

        System.out.println(Arrays.toString(kaka.instructors)); // not recommended, use the class name to access static
        System.out.println(Arrays.toString(CydeoStudent.instructors));

        System.out.println(kaka.myCoffee.amountLeft);

        kaka.drink();
        System.out.println(kaka.myCoffee.amountLeft);

        CydeoStudent nana = new CydeoStudent("nana", "atlanta", 12);
        System.out.println(nana.myCoffee.amountLeft);
        nana.drink();
        nana.drink();
        nana.drink();
        System.out.println(nana.myCoffee.amountLeft);

    }
}
