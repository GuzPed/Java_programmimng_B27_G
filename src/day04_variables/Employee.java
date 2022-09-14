package day04_variables;

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
        String lastName = "Khisa";
        String companyName = "DSM";
        String jobTitle = "Customer Service Assistant";
        char suite = 'A';
        int employeeId = 175;
        int numberOfPto = 20;
        int salary = 120_000;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName;
        String email = firstName + employeeId + "@" +companyName + ".com";
        String benefits = salary + " RUB a year," + numberOfPto + " PTO and work from home";

        System.out.println("Employment information for " + fullName + " at " + companyName + ". " + jobTitle + " in the room number " + suite +"\n Ms. " + fullName + " is full time: " + isFullTime + ". Bond at " + email + ". Current benefits include " + benefits + ".");




    }



}
