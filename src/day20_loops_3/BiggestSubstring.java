package day20_loops_3;

public class BiggestSubstring {
    public static void main(String[] args) {
        String s = "aaaabbbbccccddccggggeee";
        String s1 = " ";
        int max=s1.length();


        for (int i = 0; i<s.length();i++) {
            String s2=s.substring(s.indexOf(s.charAt(i)),s.lastIndexOf(s.charAt(i))+1);
            if (max<s2.length()) {
                max=s2.length();
                s1=s2;
            }
        }
        System.out.println(s1);






    }
}
