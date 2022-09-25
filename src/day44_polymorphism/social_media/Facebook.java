package day44_polymorphism.social_media;

import javax.print.attribute.standard.Media;
import java.time.LocalTime;
import java.util.ArrayList;

public class Facebook extends SocialMedia{
    /*
    Facebook

• Create a class for a Facebook which inherits the SocialMedia class and has
additional instance variables:
age, number of friends, and posts (ArrayList of Post)

• Encapsulate all the variables.

• Set the platform for "Facebook" using static block   ????

• Create a constructor that will create a Facebook by taking the username and
password.  */

    private int age;
    private int numberOfFriends;
    private ArrayList<Post> posts;

    static {

    }
    /*
• Create a constructor that will create a Facebook by taking the username and
password.

 - If the password contains the username, then it is not a valid password and
should not be saved. In this case Print “Password contained username. Default
password created: ‘password’ and set the password for the user to the default of
‘password’.

 - Create and assign the user's person url by using 'facebook.com/' and adding
their username at the end

 - Create an empty ArrayList of Posts
*/

    public Facebook(String username, String password){
        super.username = username;
        if (password.contains(username)){
            System.out.println("Password contained username Default password created: ‘password’");
            password = "password";
            super.password=password;
        } else {
            super.password = password;
        }
        super.personalUrl = "facebook.com/"+username;
        ArrayList<Post> obj = new ArrayList<>();
    }

    /*


• Overload the constructor to accept the username, password, and the user’s
name. Chain previous constructor

 - If the name entered has any characters that are not letters from the
alphabet, then the name is invalid. In this case print “invalid name” and assign the
name value to be ‘no name’
*/
    public Facebook(String username, String password, String fullName){
        this(username, password);
        for (int i=0; i<fullName.length(); i++){
            if (!Character.isLetter(fullName.charAt(i))){
                System.out.println("invalid name");
                super.fullName = "no name";
                break;
            } else {
                super.fullName = fullName;
            }
        }

    }


/*
• Overload the constructor to accept the username, password, the user’s
name, age and number of friends. Chain previous constructor

 - Only store the age and number of friends into the variables if they are valid
numbers.

- The age cannot be a negative number
- The number of friends cannot be negative or more than 5000.

If they are invalid print “Invalid (age/number of friends) and keep the values as
the default of 0.

• Implement all methods coming from Social Media

    class

o Direct messaging (String username, String message)
  - print = %message sent to %username

o Post (Object body)
  - Creates a Post object (the class we made earlier, and store the Post
objects to the ArrayList of Posts)

o Notifications ()
  - Checks the current time. If the time is between 8 am - 5 pm print
"Notification", otherwise print "Sleep mode"

 Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.

• Override the toString method to print all the information of a Facebook

• Create a sendFriendRequest method that will accept a Facebook object and
send them a friend request. The method should return a boolean:

if the friend request was sent (true) or if the friend request was not
sent (false).
 - If your friend list is at the 5000 limit then do not send the
request and print “You have reached the limit of friends.”
 - If the user you are trying to send the request to has already hit
the limit, then print “$theUsersName cannot accept any more friend
request.
 - If both the user and you are under the limit print “Friend
request sent to $theUsersName” and increase your number of friends
by one.
     */

    @Override
    public void directMessaging(String username, String message) {

    }

    @Override
    public void post(Object media) {

    }

    @Override
    public void notifications() {

    }
}
