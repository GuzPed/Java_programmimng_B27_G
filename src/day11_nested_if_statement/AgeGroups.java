package day11_nested_if_statement;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 125;
         if (age >=0 && age<=120){
             if (age <=1 ) {
                 System.out.println("baby");
             } else if (age <=5) {
                 System.out.println("toddler");
             } else if (age <=13) {
                 System.out.println("kid");
             }else if (age <=18) {
                 System.out.println("teenager");
             }else if (age <=40) {
                 System.out.println("adult");
             }else if (age <=65) {
                 System.out.println("middle age adult");
             } else {
                 System.out.println("Senior");
             }


         } else {
             if (age<0) {
                 System.out.println("you haven't been born");
             } else if (age>120) {
                 System.out.println("you are already long dead");
             }
         }




    }
}
