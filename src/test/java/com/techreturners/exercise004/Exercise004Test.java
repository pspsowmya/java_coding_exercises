package com.techreturners.exercise004;

import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    //Additional Test cases

    @Test
    public void checkGetDateTimeWithDate() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.AUGUST, 10));
        LocalDateTime expected = LocalDateTime.of(2053, Month.APRIL, 18, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWithDateTime() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2022, Month.DECEMBER, 5, 22, 20, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2054, Month.AUGUST, 14, 00, 06, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWithBothDateAndTimeAndWithDayRollOver() {
        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2022, Month.APRIL, 25, 18, 45, 45, 0));
        LocalDateTime expected = LocalDateTime.of(2054, Month.JANUARY, 01, 20, 32, 25);

        assertEquals(expected, ex004.getDateTime());
    }

}
