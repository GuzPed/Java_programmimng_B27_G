package day16_string_methods_3;

public class RelativeChecker {
    public static void main(String[] args) {
        /*        [Relative checker]
Given two full names check if the two people are related. They will be considered to be related if they have the same last name
     Input:
        James Bond
        Jamie Bond
    Output:
        Related
    -------------------
    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
         */
        String fullName1 = "James Bond";
        String fullName2 = "Alex Richard Bonderas";
        int indexOfSpaceWord1 = fullName1.lastIndexOf(" ");
        int indexOfSpaceWord2 = fullName2.lastIndexOf(" ");

        boolean isRelated = fullName1.substring(indexOfSpaceWord1+1).equalsIgnoreCase(fullName2.substring(indexOfSpaceWord2+1));

        if (isRelated) {
            System.out.println("Related");
        } else {
            System.out.println("Not Related");
        }

        System.out.println("=======================================");
       int  indexOfSpaceWord3 = fullName1.lastIndexOf(" ");
        String last = fullName1.substring(indexOfSpaceWord3+1);

        if (fullName2.endsWith(last)) {
            System.out.println("Related");
        } else  {
            System.out.println("Not related");
        }

        System.out.println(fullName2.endsWith(last)? " Related" : "Not related");




    }



}
