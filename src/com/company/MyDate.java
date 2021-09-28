package com.company;

public class MyDate {
    private int year;
    private String month;
    private int day;

    public MyDate(int year, String month, int day){
        this.year = year;
        this.month = month;
        this.day = day;

    }
    public String toString(){
        return "Year: " + year + " Month: " + month + " Day: " + day;
    }

}
