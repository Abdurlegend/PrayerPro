# PrayerPro
The purpose of this application is to make it easy  for end users who want to know or keep track of their daily Muslim prayers by accessing this Prayer application. The users will  also have the luxury to choose which city they are located in and can receive the most accurate prayer times according to their City time zones. 


This desktop project was  done using JavaFX, the Maven framework and the MVC design framework. In my Prayer Desktop application, the end user will be able to use this app to calculate and verify the daily Muslim prayer times according to their chosen cities. The end user will also have the option to go to the setting section of the application and set up an alarm (Adhan) for each prayer time, such as: Fajr, Zuhr, Asr, Maghrib, Isha. The user will also be able to see the prayer times being updated daily. The user will also get daily reminders to read a certain surah or hadith on a given day.



Some of the challenges that I faced was not being able to run the tests properly due to not having the maven depdency for it, as well as I faced some difficulties for when a user selects on New york the prayer times wont update and this was due to the new york text file not having the same format as the other files, therefore I had to fix the format and make some adjustments.


Design: In my Application I have a class called Prayer which has two varaibles such as paryername  and prayerTime, this class is resposible for getting the prayer name and prayer timings from the text files. I have another class called Prayersync service which is resposnible for reading the textfile and getting the prayer times from it depending on which city the user selected in the drop down menu. I also have an interface which has three methods such as refresh, seSetting and exucute and the userCityControl class implements this interface. In the userCityControl class the SetSetting method is used for setting the city value according to what the user selected and getting it.
 






Picture of Uml diagram:
![Uml case diagram](https://user-images.githubusercontent.com/103337298/170532284-ce401278-bef1-4095-a94a-d020e0836c8b.png)


