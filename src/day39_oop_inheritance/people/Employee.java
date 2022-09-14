package day39_oop_inheritance.people;

public class Employee extends Person {

    double salary;

   public Employee(String name, int age) {
       super(name, age);
    }

    public Employee(String name, int age, double salary) {
        this(name, age);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
public Employee() {
       super();  // calls parent constructor with no ergs
    }
 */