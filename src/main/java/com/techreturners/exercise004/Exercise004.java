package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    LocalDateTime dateTime;
    static final long GIGA_SECOND = (long) Math.pow(10, 9);

    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds(GIGA_SECOND);
    }
}
