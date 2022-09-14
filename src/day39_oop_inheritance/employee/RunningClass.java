package day39_oop_inheritance.employee;

public class RunningClass {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Maria", true, 150000, true);
        System.out.println(dev1);
        dev1.work();
        dev1.develop();


        Tester test1 = new Tester("Gallya", false, 80000, true);
        System.out.println(test1);
        test1.work();
        test1.test();


        Employee emp1 = new Employee("Mars", false, 50000);
        System.out.println(emp1);
        emp1.work();



    }
}
