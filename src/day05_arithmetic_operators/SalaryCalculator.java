package day05_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 100_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;

        double stateTax =  salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("My salary is $" + salary + " but after taxes I get only $" + salaryAfterTax +".\n If you would like to know the tax rates so I can tell you: the State Tax rate is " + stateTaxRate + ", and Federal Tax Rate is " + federalTaxRate + ", \n so Goverment takes from my salary $" + stateTax + " for State Tax and $" + federalTax + " for Federal Taxes. I am so mad!");


    }


}
