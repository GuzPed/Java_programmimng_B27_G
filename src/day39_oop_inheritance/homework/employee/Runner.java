package day39_oop_inheritance.homework.employee;

public class Runner {
    public static void main(String[] args) {

        Tester test1 = new Tester("Gu", true, 150000, true);

        System.out.println(test1);
        test1.teste();
        test1.word();

        Developer dev1 = new Developer("NF", true, 130000, true);
        System.out.println(dev1);
        dev1.develop();
        dev1.word();



    }
}
