package day36_custom_classes_constructor.hobby;

public class Hobby {
/*
create a class called Hobby
        - data:
            name, annual cost, is outdoors (boolean), requires others (boolean)
*/
    String name;
    double annualCost;
    boolean isOutdoor;
    boolean requuiresOthers;

    /*
        - constructor
            - create a constructor that creates a Hobby object with the name
            - create a constructor that creates a Hobby object with the name and annual cost
            - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others
*/

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoor, boolean requuiresOthers) {
        this(name, annualCost);
        this.isOutdoor = isOutdoor;
        this.requuiresOthers = requuiresOthers;
    }



    /*  - method:
                - doIt():
                    print: Doing $name-of-hobby $outside-or-inside
                        ex: new Hobby("golf", 100, true, false).doIt() -> Doing golf outside
                        ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside
                - toString()
                    print all the Hobby information*/
    public void doIt() {
        if (isOutdoor) {
            System.out.println("Doing " + name + " outdoor");
        } else {
            System.out.println("Doing " + name + " inside");
        }}

    @Override
    public String toString() {
        String result = "\n< " + "Your Hobby is " + name + ", annualCost=" + annualCost;
                if (isOutdoor) {
                   result += ", it is ourdoor hobby ";
                } else {
                    result += ", it is inside hobby ";
                }

                if (requuiresOthers) {
                    result += ", bring others! ";
                } else {
                    result += ", you can do it alone!";
                }
                return  result;
    }

     /*
    Create a separate class to create and test the Hobby objects

        - create an java.util.ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */


    }

