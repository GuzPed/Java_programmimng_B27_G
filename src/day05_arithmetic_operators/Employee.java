package day05_arithmetic_operators;

public class Employee {
      /*
    declare and assign these variables with the most appropriate datatypes:

        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

    declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.
     */


    public static void main(String[] args) {
        String firstName = "Guzel";
        String lastName= "Khisamieva";
        String companyName = "DSM";
        String jobTitle = "Customer Service Assistante";
        char suite = 'A';
        int employeeId = 7;
        int numberOfPTO = 155;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName +" " + lastName;
        String email = firstName + employeeId + '@' + companyName + ".com";
        String benefits = "$"+ salary + " salary a year, " + numberOfPTO + " PTO and work from home.";

        System.out.println("\tEmployment information for " + fullName + ". " + jobTitle + " for " + companyName + ", based in suite " + "\""  + suite + "\"" + ".\n Ms. " + lastName + " is full time: " + isFullTime + ". Contact Ms. " + lastName + " at " + email + ". \n Current benefits include " + benefits );









    }

}
