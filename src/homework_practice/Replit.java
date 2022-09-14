package homework_practice;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        double totalPrice=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize=scan.next();
        switch(screenSize){
            case "13.3":
                totalPrice+=200;
                break;
            case "15.0":
                totalPrice+=300;
                break;
            case "17.3":
                totalPrice+=400;
                break;
        }
        System.out.println("Select CPU type:");
        String CPU=scan.next();
        switch(CPU){
            case "i3":
                totalPrice+=150;
                break;
            case "i5":
                totalPrice+=250;
                break;
            case "i7":
                totalPrice+=350;
                break;
        }
        System.out.println("Select RAM size:");
        int RAM =scan.nextInt();
        totalPrice+=RAM/4*50;

        System.out.println("Select storage type:");
        String storageType=scan.next();
        System.out.println("Select storage size:");
        int storageSize=scan.nextInt();
        if(storageType.equals("HDD"))
            totalPrice+=storageSize/500*50;
        else
            totalPrice+=storageSize/500*100;

        System.out.println("Select screen resolution:");
        String resolution=scan.next();
        switch(resolution){
            case "FULLHD":
                totalPrice+=100;
                break;
            case "4K":
                totalPrice+=200;
                break;
        }
        System.out.println("Final price is: $"+totalPrice);


    }

}
