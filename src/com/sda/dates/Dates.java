package com.sda.dates;

import java.time.LocalDate;
import java.time.Month;

public class Dates {
    public static void main(String[] args) {
        //leapYears(1800, 2000);
        for (int i = 1; i <= 12; i++)
            printMonthRhyme(LocalDate.of(2020, Month.of(i), 1));
    }

    public static void leapYears(int yearFrom, int yearTo) {
        for (int i = yearFrom; i <= yearTo; i++) {
            //if(i%4==0){
            //if (LocalDate.ofYearDay(i, 1).lengthOfYear() == 366) {
            if (LocalDate.ofYearDay(i, 1).isLeapYear()) {
                System.out.println(i);
            }
        }
    }

    public static void printMonthRhyme(LocalDate date) {
        System.out.println(Rhymes.valueOf(date.getMonth().name()).getTextPl());
    }
}
