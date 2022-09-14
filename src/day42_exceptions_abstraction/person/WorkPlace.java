package day42_exceptions_abstraction.person;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {
    public static void main(String[] args) {

     //   Person obj = new Person();
    //    Employee obj2 = new Employee();

        Tester baz = new Tester("Baz", 20, "SDET", 100_000 );

        System.out.println(baz);

        baz.sleep(8);
        baz.work();

        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(baz);
        testers.addAll(Arrays.asList(new Tester("Guzel", 12, "SDET", 150000), new Tester("Kai", 5, "QA", 1450000), new Tester("Beyza", 13, "lead QA", 149000)));

        System.out.println(testers);

        for(Tester each: testers){
            System.out.println(each);
            each.sleep(8);
            System.out.println();
        }

    }
}
