package day23_arrays_day2;

public class WebsiteChecker_homework {
    public static void main(String[] args) {
        /*
        Website checker

	Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain

Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu
         */
        String[] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov"," linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};
        int countCom = 0;
        int countOrg = 0;
        int countEdu = 0;
        int countOther = 0;


        for (String each: websites) {
            if (each.endsWith(".com")) {
                countCom++;
            } else if (each.endsWith(".org")) {
                countOrg++;
            } else if (each.endsWith(".edu")) {
                countEdu++;
            } else {
                countOther++;
            }
        }

        System.out.println(".com " + countCom );
        System.out.println(".org " + countOrg );
        System.out.println(".edu "  + countEdu );
        System.out.println("other " + countOther );

        System.out.println("===================================");

    /*    String[] websitesOne = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov"," linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};

        String[] parts = {".com ",".org ", ".edu ", ".jp", ".gov", ".io", ".net" };

        for (String each: parts) {

            for (int i=0; i<websitesOne.length;i++) {

            }

*/









    }

}

