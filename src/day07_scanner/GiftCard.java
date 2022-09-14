package day07_scanner;

public class GiftCard {
    public static void main(String[] args) {
        int giftCard = 500;
        int timesUsed = 3;
        System.out.println("we used gift card and remaining is " + (giftCard-=150) + " and available times to use - " + --timesUsed );
        System.out.println(" we used it again and we have available $" + (giftCard-=99) + "we can use this card " + --timesUsed + " more time");



    }



}
