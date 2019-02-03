package com.company.chapter2;

/**
 * Created by levrun on 03.02.2019.
 */
public class MovieTestDrive {

    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комдия";
        two.rating = 5;
        Movie three = new Movie();
        three.title = "Байт-клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
        one.playIt();
        two.playIt();
    }
}
