package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    String getCurrentDate () {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");
        String currentDate = formatForDateNow.format(dateNow);
        System.out.println(currentDate);
        return currentDate;
    }
}
