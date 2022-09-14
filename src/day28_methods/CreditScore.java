package day28_methods;

public class CreditScore {

    public static void main(String[] args) {
        checkScore(800);
        checkScore(600);


        checkScore2(789); // will not anything, it just floating in the air
        System.out.println(checkScore2(789));  // true


        if (checkScore2(600)) {  // get higher score
            System.out.println("Get a loan");
        } else {
            System.out.println("get a higher score");
        }

    }

    public static void checkScore (int score) {
        if (score > 700) {
            System.out.println("good score");
        } else {
            System.out.println("not a good score");
        }
    }

public static boolean checkScore2 (int score) {
        return  score >700;
}















}
