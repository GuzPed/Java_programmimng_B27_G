package day21_nested_loop;

public class BiggestSubstring11 {
    public static void main(String[] args) {
String str = "aaabbbcccccccddddeeeeeeeeeeeeeeeee";
String longest = "";
String each= "";

for (int i=0; i<str.length()-1;i++) {
    each+= str.charAt(i);

    if (i== str.length()-2 && str.charAt(i)== str.charAt(i+1)) {
        each+=str.charAt(i+1);
        if (each.length()>longest.length()) {
            longest =each;
        }
    }

    if (str.charAt(i) != str.charAt(i+1)) {
        if (each.length()>longest.length()) {
            longest =each;
        }
        each = "";
    }

}
        System.out.println(longest);



    }
}
