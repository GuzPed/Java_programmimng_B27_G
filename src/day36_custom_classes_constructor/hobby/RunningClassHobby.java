package day36_custom_classes_constructor.hobby;

import java.util.ArrayList;

public class RunningClassHobby {
    /*
    Create a separate class to create and test the Hobby objects

        - create an java.util.ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */
    public static void main(String[] args) {
        ArrayList<Hobby> hobby1 = new ArrayList<>();
        hobby1.add(new Hobby("Swimming", 3000, true, false));
        hobby1.add(new Hobby("Painting", 500));
        hobby1.add(new Hobby("Football", 150, true, true));
        hobby1.add(new Hobby("Cycling", 5000, true, true));
        hobby1.add(new Hobby("jogging", 0, true, false));
        hobby1.add(new Hobby("Chez", 200, false, true));
        hobby1.add(new Hobby("Gardening", 5000, true, false));
        hobby1.add(new Hobby("Beach Volleyball", 20, true, true));


        for (Hobby each: hobby1) {
            each.doIt();
        }

        ArrayList<Hobby> hobby2 = new ArrayList<>(hobby1);
        hobby2.removeIf(each-> each.isOutdoor);
        System.out.println(hobby2);

        ArrayList<Hobby> hobby3 = new ArrayList<>(hobby1);
            hobby3.removeIf(p-> p.requuiresOthers);
        hobby3.forEach(each-> System.out.println(each));

        ArrayList<Hobby> hobby4 = new ArrayList<>(hobby1);
        hobby4.removeIf(each->each.annualCost>500);
        System.out.println(hobby4);









    }






}
