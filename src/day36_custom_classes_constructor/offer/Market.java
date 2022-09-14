package day36_custom_classes_constructor.offer;

import java.util.ArrayList;

public class Market {
     /*
    Create a separate class to create and test the Offer objects

    create multiple Offer objects and store them into an ArrayList of Offers. Create multiple other Lists to filter out different information:

        write a program that can only keep the offers from local area


        write a program that can remove the offers that are not full Time

        write a program that removes all offer that are less than 100,000 salary

        - Find the biggest and lowest salary Offers and print the whole object
     */

    public static void main(String[] args) {
        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(new Offer("Amazon", "San Diego", 120_000, true, 15));
        allOffers.add(new Offer("Chase", "Chicago", 125_000, true, 15));
        allOffers.add(new Offer("Google", "Seattle", 170_000, false, 0));
        allOffers.add(new Offer("Accenture", "Chicago", 110_000, false, 5));
        allOffers.add(new Offer("Walmart", "Chicago", 125_000, false, 0));
        allOffers.add(new Offer("Meta", "Seattle", 135_000, true, 12));
        allOffers.add(new Offer("Delloitte", "Seattle", 135_000, true, 12));


        // write a program that can only keep the offers from local area
        ArrayList<Offer>  localOffer = new ArrayList<>(allOffers);
        localOffer.removeIf(offer -> !offer.location.equalsIgnoreCase("Chicago"));
        System.out.println(localOffer);

        for(Offer each: allOffers){
            if (each.location.equalsIgnoreCase("Chicago")) {
                System.out.println(each);
            }
        }

        System.out.println("==========================================");
        //  write a program that can remove the offers that are not full Time
        ArrayList<Offer>  onlyFullTime = new ArrayList<>(allOffers);
        onlyFullTime.removeIf(offer-> !offer.isFullTime);
        onlyFullTime.forEach(each-> System.out.println(each));
        // System.out.println(onlyFullTime);

        System.out.println("==========================================");
        // write a program that removes all offer that are less than 120,000 salary
        ArrayList<Offer>  minSalary = new ArrayList<>(allOffers);
        minSalary.removeIf(offer-> offer.salary<130000);
     //   minSalary.forEach(each-> System.out.println(each));
        System.out.println(minSalary);

        System.out.println("==========================================");
        //- Find the biggest and lowest salary Offers and print the whole object
        double min = allOffers.get(0).salary;
        double max = allOffers.get(0).salary;
        Offer maxOffer = allOffers.get(0);
        Offer minOffer = allOffers.get(0);

        for (Offer each: allOffers){
            if(each.salary > max) {
                max=each.salary;
                maxOffer = each;
            }
            if (each.salary< min) {
                min = each.salary;
                minOffer = each;
            }
        }
        System.out.println("min salary " + min);
        System.out.println(" min offer : " + minOffer);
        System.out.println("max salary "  + max);
        System.out.println("max offer : " + maxOffer);


    }



}
