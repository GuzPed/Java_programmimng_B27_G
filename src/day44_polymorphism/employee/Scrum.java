package day44_polymorphism.employee;

public class Scrum {
    public static void main(String[] args) {
        //Reference of super classes

        Person tester1=new Tester("James", "SPY", 150_000);
        System.out.println(tester1);
        //tester1 can access the name variable

        //these are not accessible because the Person reference does not have access tp them
        //tester1.work();
        //tester1.create();

        Employee tester2 = new Tester("Jose", "SDET", 200_000);
        System.out.println(tester2);

        //in total tester2 has access to ame, jobTitle, salary, work()

        tester2.work();

        Object tester3 = new Tester("Milana", "Tester", 300_000);
        //does not have access to a anything new. nothing from person, employee, or tester

        CreateSmokeTest tester4 = new Tester("Guzel", "QA", 400000);
        //tester4.work();
        tester4.create();  // has access to create only

        Tester tester5 = new Tester("Rose", "QA", 100000);
        tester5.work();
        tester5.writeBugReport();
        tester5.create();
        //has access to everething in tester class









    }
}
