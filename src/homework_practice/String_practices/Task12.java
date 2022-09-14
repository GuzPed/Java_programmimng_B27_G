package homework_practice.String_practices;

public class Task12 {
    public static void main(String[] args) {
        /*
        [Relative checker]

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
        String firstname = "James Bond";
        String secondName = "Jamie Maria Bond Gonzales";

        int indexOfSpace = firstname.lastIndexOf(" ");
        String lastNameOfFirstName = firstname.substring(indexOfSpace+1);

        if (secondName.contains(lastNameOfFirstName)) {   // or to use endsWith(lastNameOfFirstName)
            System.out.println("related");
        } else {
            System.out.println("not related");
        }



    }
}
