package com.example.prayerpro;

public class MorningPrayer extends Prayer {
    public MorningPrayer(String prayerName, String prayerTime) {
        super(prayerName, prayerTime);
    }

    public static void callToPrayer(){
        // IMPLEMENTATION CODED HERE - HOWEVER COMMENTED SINCE WE DONT HAVE LIBRARY INCLUDED
        /*
        String filename = "morningPrayer.mp3";
        Media fileMedia = new Media(new File(filename).toURI().toString());
        MediaPlayer mediaplayer = new MediaPlayer(fileMedia);
        mediaplayer.play();
         */
    }
}
