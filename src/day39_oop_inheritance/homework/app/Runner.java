package day39_oop_inheritance.homework.app;

import day39_oop_inheritance.app.Youtube;

public class Runner {
    public static void main(String[] args) {

        Instragram insta = new Instragram("15.02.63");
        System.out.println(insta);

        insta.postPicture();
        insta.download();

        YouTube you = new YouTube("153.858");
        System.out.println(you);
        you.download();
        you.watchVideo();


    }

}
