package com.example.prayerpro;

public class  Prayer {
    private String prayerName;
    private String prayerTime;  // STORE AT CALENDAR DATA TYPE IN FUTURE ITERATIONS

    public Prayer(String prayerName, String prayerTime){
        this.prayerName = prayerName;
        this.prayerTime = prayerTime;
    }

    public String getPrayerName(){
        return this.prayerName;
    }

    public String getPrayerTime(){
        return this.prayerTime;
    }

    public static void callToPrayer(){
        // IMPLEMENTATION CODED HERE - HOWEVER COMMENTED SINCE WE DONT HAVE LIBRARY INCLUDED
        /*
        String filename = "regularPrayer.mp3";
        Media fileMedia = new Media(new File(filename).toURI().toString());
        MediaPlayer mediaplayer = new MediaPlayer(fileMedia);
        mediaplayer.play();
         */
    }

    //public abstract void callToPrayer();
}


