package day20_loops_3;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        String input = "cbcvcbfabcdfgdfgmhabc";
        String removeDuplicate = "";

        for (int i = 0; i < input.length(); i++) {
            String eachWord = input.substring(i, i+1);;
            if (!removeDuplicate.contains(eachWord)){
                removeDuplicate += eachWord;
            }
        }

        System.out.println(removeDuplicate);

    }
}
