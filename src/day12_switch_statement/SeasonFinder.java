package day12_switch_statement;

import java.util.Scanner;

/*
Season Finder
declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall
Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
 */
public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int month = input.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It is Winter time! you should put as many clothes as you can to keep your ass warm and cozy");
            case 3:
            case 4:
            case 5:
                System.out.println("It is Spring! nice weather is coming, sun and flowers! a lot of love. still should wear warm clothes, because the weather can change fast");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is Summer! hos AF! you can be naked");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is Fall! amazing color of nature! it is getting chilj");
            default:
                System.out.println("don't know from where you gor this number of month");

        }


    }

}
