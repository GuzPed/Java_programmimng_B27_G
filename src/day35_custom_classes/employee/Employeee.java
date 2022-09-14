package day35_custom_classes.employee;

public class Employeee {
    /*
      create a class called Employee
        - data:
            name, id, job title, salary
        - constructor
            - create a constructor that creates an Employee object with the name, id, job title, and salary
        - method:
            goToMeeting()
                when this method is called print:
                    $name is going to a meeting
            toString()
                print all the employees information
    Create a separate class to create and test the Employee objects
     */

    String name;
    int id;
    String jobTitle;
    double salary;

    public Employeee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public void goToMeeting(){
        System.out.println(name + " is going to the meeting");
    }

    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
