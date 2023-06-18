package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 2 || monthNumber == 12) {
            System.out.println("Winter");
            return;
        }
        if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("Spring");
            return;
        }
        if (monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("Summer");
            return;
        }
        if (monthNumber >= 9 && monthNumber <= 11) {
            System.out.println("Fall");
            return;
        }
        System.out.println("Wrong month number");
    }
}
