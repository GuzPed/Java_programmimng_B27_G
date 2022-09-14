package day36_custom_classes_constructor.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Work {
    public static void main(String[] args) {

        Employee james = new Employee("James Bond", 007, "Spy", 10_000_000);
        james.gotoMeeting();
        System.out.println(james);

        Employee obj2 = new Employee("Ana");
        System.out.println(obj2);

        Employee obj3 = new Employee("Nana", 8);
        System.out.println(obj3);


        System.out.println("============================================");
        EmployeeV2 james2 = new EmployeeV2("James Bond", 007, "Spy", 10_000_000);
        james.gotoMeeting();
        System.out.println(james2);

        EmployeeV2 obj5 = new EmployeeV2("Ana");
        System.out.println(obj5);

        EmployeeV2 obj7 = new EmployeeV2("Nana", 8);
        System.out.println(obj7);

        EmployeeV2 obj12 = new EmployeeV2("Arinsa", 12, "CEO");
        System.out.println(obj12);

        // for practise
        Employee[] arr = new Employee[3];
        arr[0] = james;
        arr[1] = obj2;
        arr[2] = obj3;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].name);
        System.out.println(arr[0].salary);

        ArrayList<Employee> list = new ArrayList<>();

    }
}
