package com.kyukin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime present = LocalTime.now();

        System.out.println("present : " + present);
        System.out.println("today : " + today + "\n");

        System.out.println(today + " " + present);

        LocalDate birthday = LocalDate.of(2005, 04, 14);
        LocalTime birthtime = LocalTime.of(11,11,11);


        
        System.out.println("===========Birthday=========");
        System.out.println(birthday + " " + birthtime);

    }

}
