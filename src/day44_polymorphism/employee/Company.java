package day44_polymorphism.employee;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new Tester("Anam", "QA", 10000));
        allEmployees.add(new Tester("Hunsa", "SDET", 120000));
        allEmployees.add(new Developer("James", "Developer", 500000));
        allEmployees.add(new Developer("Baz", "Developer", 30000));

        double biggestSalary = allEmployees.get(0).salary; //default salary

        for (Employee each: allEmployees){
            if (each.salary>biggestSalary){
                biggestSalary=each.salary;
            }
        }

        System.out.println(biggestSalary);



        ArrayList<Tester> allTesters = new ArrayList<>();
        ArrayList<Developer> allDevelopers = new ArrayList<>();

        for (Employee each: allEmployees){
            if (each instanceof  Tester){
                allTesters.add((Tester) each);
            } else if( each instanceof Developer){
                allDevelopers.add((Developer) each);
            }
        }
        System.out.println(allDevelopers);
        System.out.println(allTesters);

    }
}
