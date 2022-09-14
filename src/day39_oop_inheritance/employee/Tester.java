package day39_oop_inheritance.employee;

public class Tester extends Employee {
    /*
    Create a class Tester

	- Tester class inherits Employee class

	- create additional variables:
		bugs found

	- create method:
		test()
			Example output: prints Running the regression
     */

    boolean bugFound;

    public Tester(String name, boolean isFullTime, double salary, boolean bugFound) {
        super(name, isFullTime, salary);
        this.bugFound = bugFound;
    }

    public void test(){
        System.out.println("Running the regression");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "bugFound=" + bugFound +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
