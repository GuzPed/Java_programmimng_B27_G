package day30_methods_practice_wrapper.homework;

public class Task3 {
    /*
     Valid Password

 Given a String password find out if it is a valid password

 Requirements:

     Must have at least 8 characters
     Must have at least 1 uppercase letter
     Must have at least 1 lowercase letter
     Must have at least 1 number
     Must have one of the follow special characters:
         ! @ # $ % ^ & *
      */
    public static void main(String[] args) {
        String s= "49jaVA33EOWe82@!";
        System.out.println(validPassword(s));
    }

    public static boolean validPassword(String s){
        int upper =0, lower=0, number=0, special =0;
        String specialCharacters = "!@#$%^&*";

        if (s.trim().length()>=8) {
                for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    upper++;
                } else if (Character.isLowerCase(s.charAt(i))) {
                    lower++;
                } else if (Character.isDigit(s.charAt(i))) {
                    number++;
                } else if (specialCharacters.contains(""+s.charAt(i))) {
                        special++;
                    }
                    //                    for (int j=0; j<specialCharacters.length(); j++) {
//                        if (s.charAt(i) == specialCharacters.charAt(j)) {
//                            special++;
//                        }
//                    }
                }
        } else {
            return false;
        }
        return (upper >=1 && lower>=1 && number>=1 && special==1);
    }


}
