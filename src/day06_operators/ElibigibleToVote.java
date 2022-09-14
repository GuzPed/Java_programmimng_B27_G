package day06_operators;

public class ElibigibleToVote {
    public static void main(String[] args) {
        int age = 33;
        boolean isCitizen = true;
        boolean hasCirimalBackground = false;
        boolean over18 = age >= 18;
        boolean isEligible = isCitizen && over18 && !hasCirimalBackground;
        /*
                    isCitizen && over18 && !hasCirimalBackground
                    true      &&      true  &&      !false = true
                    true && true && true
                    True
                                true
                          true && true

         */




    }



}
