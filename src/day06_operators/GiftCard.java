package day06_operators;

public class GiftCard {
    public static void main(String[] args) {
        int giftCard = 500;
        byte timesUsed = 3;
        giftCard -= 150;

        System.out.println("We used out gift card 1 time, so we have remaing $" + giftCard + " and avalaible times " + --timesUsed);
        giftCard -= 99;

        System.out.println("then we used our gift card another time and we have available $" + giftCard +  " and we can use our card " + --timesUsed + " more time");








    }


}
