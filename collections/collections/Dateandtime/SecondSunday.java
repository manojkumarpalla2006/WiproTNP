package Dateandtime;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondSunday {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now()
                .plusMonths(1)
                .withDayOfMonth(1)
                .with(TemporalAdjusters.dayOfWeekInMonth(2,
                        java.time.DayOfWeek.SUNDAY));

        System.out.println("Second Sunday of Next Month: " + date);
    }
}