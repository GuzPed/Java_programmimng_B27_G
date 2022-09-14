package day36_custom_classes_constructor.song;

public class Radio {
    public static void main(String[] args) {
        Song song = new Song("Coldplay", 3.5, "Djaki Jan", "rock/pop");

        System.out.println(song);


        Song song2 = new Song("four season", 2.8);
        System.out.println(song2);


    }
}
