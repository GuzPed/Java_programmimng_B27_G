package day39_oop_inheritance.app;

public class RunningClass {
    public static void main(String[] args) {

        App app1 = new App("TikTok", "1.3.5");
        System.out.println(app1.version);
        System.out.println(app1.appName);
        app1.download();

        System.out.println(app1);
        System.out.println("+++++++++++++++++++++++++++++++++");

        Instagram insta1 = new Instagram("Insta1", "15.3.5");
        System.out.println(insta1);
        insta1.postPicture();
        insta1.download();
        System.out.println("+++++++++++++++++++++++++++++");
        Youtube you1 = new Youtube("you1", "1.0");
        System.out.println(you1.appName);
        System.out.println(you1.version);
        you1.download();
        you1.watchVideo();




    }



}
