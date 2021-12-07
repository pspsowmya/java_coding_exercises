package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Exercise004 {

    LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
       return dateTime.plusSeconds((long) Math.pow(10,9));
    }
}
