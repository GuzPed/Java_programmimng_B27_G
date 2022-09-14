package day06_operators;

public class BuyHouse {
    /*
    declare and assign a credit score variable
    declare and assign a salary

    determine if you can get a loan to buy a house
    there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above
     */


    public static void main(String[] args) {
        int creditScore = 719;
        int salary = 120000;
        boolean getLoan = (creditScore>=720 && salary >= 100000) || (creditScore >=740 && salary >=80000);
        System.out.println("getLoan = " + getLoan);





    }


}
