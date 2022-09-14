package day39_oop_inheritance.homework.employee;

public class Developer extends Employee{
    /*
Create a class Developer
	- Developer class inherits Employee class
	- create additional variables:
		features created
	- create method:
		develop()
			Example output: prints Creating more features
     */

    boolean featureCreated;

    public Developer(String name, boolean isFullTime, double salary, boolean featureCreated) {
        super(name, isFullTime, salary);
        this.featureCreated = featureCreated;
    }

    public void develop(){
        System.out.println(name + " is creating more features");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "featureCreated=" + featureCreated +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
