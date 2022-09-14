package homework_practice.class_methods;

import java.util.ArrayList;

public class RunningClassOffer {
     /*
    Create a separate class to create and test the Offer objects

    create multiple Offer objects and store them into an ArrayList of Offers. Create multiple other Lists to filter out different information:

        write a program that can only keep the offers from local area

        write a program that can remove the offers that are not full Time

        write a program that removes all offer that are less than 100,000 salary

        - Find the biggest and lowest salary Offers and print the whole object
     */
     public static void main(String[] args) {
         ArrayList<Offer> offers = new ArrayList<>();
         offers.add(new Offer("Amazon", "San Diego"));
         offers.add(new Offer("DSM", "Moscow", 120000));
         offers.add(new Offer("Google", "New York", 150000, true, 15));
         offers.add(new Offer("USPS", "Atlanta", 12000, false, 10));
         System.out.println(offers);

         ArrayList<Offer> offer2 = new ArrayList<>(offers);
         offer2.removeIf(each-> !each.location.equals("Moscow"));
         System.out.println(offer2);
         System.out.println("++++++++++++++++++++++++++");
         ArrayList<Offer> offer3 = new ArrayList<>(offers);
         offer3.removeIf(each-> each.isFullTime);
         System.out.println(offer3);





     }

}
