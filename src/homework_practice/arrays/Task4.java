package homework_practice.arrays;

public class Task4 {
    /*
    Website checker

	Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain

Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu
     */
    public static void main(String[] args) {
        int countCom = 0;
        int countOrg = 0;
        int countEdu = 0;

        String[] web = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};
        for (String each: web){
            if (each.contains(".com")){
                countCom++;
            } else if (each.contains(".org")) {
                countOrg++;
            }else if (each.contains(".edu")) {
                countEdu++;
            }
        }

        System.out.println(countCom);
        System.out.println(countOrg);
        System.out.println(countEdu );




    }


}
