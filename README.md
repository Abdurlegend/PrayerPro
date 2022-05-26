
# PrayerPro
The purpose of this application is to make it easy  for end users who want to know or keep track of their daily Muslim prayers by accessing this Prayer application. The users will  also have the luxury to choose which city they are located in and can receive the most accurate prayer times according to their City time zones.


// There some aspects to the readme file which I forgot to update beforehand
This desktop project was  done using JavaFX, the Maven framework and the MVC design framework. In my Prayer Desktop application, the end user will be able to use this app to calculate and verify the daily Muslim prayer times according to their chosen cities. The end user will also have the option to go to the setting section of the application and set up an alarm (Adhan) for each prayer time, such as: Fajr, Zuhr, Asr. Maghrib, Isha. The user will also be able to see the prayer times being updated daily. The user will also get daily reminders to read a certain surah or hadith on a given day.



Some of the challenges that I faced was not being able to run the tests properly due to not having the maven tendency for it, as well as I faced some difficulties for when a user selects on NewYork the prayer times won't update and this was due to the new york text file not having the same format as the other files, therefore I had to fix the format and make some adjustments.


Design: In my Application I have a class called Prayer which has two variables such as prayername and prayerTime, this class is inherirated by the Morning Prayer class which is supposed to include the audio for the call to Prayer for Fajr, but due to not having the jar library I was not able to include the audio. I have another class called Prayer sync service which is responsible for reading the text file and getting the prayer times from it depending on which city the user selected in the drop down menu. I also have an interface which has three methods such as refresh, set Setting and exucute and the userCityControl class implements this interface. In the userCityControl class,  the SetSetting function is used for setting the city value according to what the user selected and getting it and the execute






Here our screenshots of the  some of the class used in the application

![Interface](https://user-images.githubusercontent.com/103337298/170544857-a63b56c8-85da-48b0-b624-041165874bdb.png)


![Prayersyncclass](https://user-images.githubusercontent.com/103337298/170544885-2885eb6c-5f84-4836-8078-8b3facd196f7.png)

![UsercityClass](https://user-images.githubusercontent.com/103337298/170544817-34e3e9fe-b9f6-40f7-8740-06587add5f78.png)



Picture of Uml diagram:
![Uml case diagram](https://user-images.githubusercontent.com/103337298/170532284-ce401278-bef1-4095-a94a-d020e0836c8b.png)


