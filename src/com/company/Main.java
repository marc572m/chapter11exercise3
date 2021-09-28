package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyDate mydate = new MyDate(2021,"September",28);
        System.out.println(mydate);

        MyDate birthday = new MyDate(2000, "July" , 20);
        System.out.println(birthday);


    }
}
