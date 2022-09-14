package day39_oop_inheritance.homework.employee;

public class Employee {
    /*
    Create a Employee class

	- create variables:
		name, is full time, salary

	- create method:
		work()
			Example output: prints $name is working
     */

    String name;
    boolean isFullTime;
    double salary;

    public Employee(String name, boolean isFullTime, double salary) {
        this.name = name;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    public void word(){
        System.out.println(name + " is working");
    }


}
