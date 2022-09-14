package day39_oop_inheritance.homework.employee;

public class Tester extends Employee{
    /*
    Create a class Tester

	- Tester class inherits Employee class

	- create additional variables:
		bugs found

	- create method:
		test()
			Example output: prints Running the regression
     */

    boolean bugsFound;

    public Tester(String name, boolean isFullTime, double salary, boolean bugsFound) {
        super(name, isFullTime, salary);
        this.bugsFound = bugsFound;
    }

    public void teste(){
        System.out.println(name + " is running the regression test");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "bugsFound=" + bugsFound +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
