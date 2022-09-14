package day24_arrays_day3;

public class ReverseTheSentence_5 {
    public static void main(String[] args) {

        String str = "Today is Friday. Have a good weekend";

        //reverse : weekend! good a Have Friday. is Today

        String[] words = str.split(" ");

        String reversed = "";

        for (int i = words.length-1; i>0; i--){
            reversed +=words[i] + " ";
        }
        System.out.println(reversed.trim());

        System.out.println("===============================");


        String reverse = "";

        for (String each:words) {

            String eachReverse = "";
            for(int i=each.length()-1; i>=0; i--) {
                eachReverse += each.charAt(i) ;
            }
            reverse +=eachReverse + " ";
        }

        System.out.println(reverse);


    }
}
