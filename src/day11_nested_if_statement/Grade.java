package day11_nested_if_statement;

public class Grade {
    public static void main(String[] args) {
        int score = 45;
        if (score >=75){
            System.out.println("passed");
            if (score>92) {
                System.out.println("you did really well");
            } else if (score >80) {
                System.out.println("good job");
            } else {
                System.out.println("not bad");
            }
        } else  {
            System.out.println("failed ");
            if (score >50) {
                System.out.println("try harder");
            } else {
                System.out.println("stupid");
            }



        }



    }
}
