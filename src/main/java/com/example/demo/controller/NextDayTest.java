package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayTest {
    @Test
    public void testNextDay() {
        LocalDate date = LocalDate.of(2022, 12, 31);
        LocalDate nextDay = NextDay.getNextDay(date);

        assertEquals(LocalDate.of(2023, 1, 1), nextDay);
    }

}

class NextDay {
    public static LocalDate getNextDay(LocalDate date) {
        return date.plusDays(1);
    }
}




