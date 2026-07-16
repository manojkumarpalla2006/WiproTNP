package Dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class Experience {

    public static void main(String[] args) {

        // Change joining date as needed
        LocalDate joiningDate = LocalDate.of(2024, 1, 15);

        LocalDate today = LocalDate.now();

        Period p = Period.between(joiningDate, today);

        System.out.println("Experience:");
        System.out.println(p.getYears() + " Years "
                + p.getMonths() + " Months "
                + p.getDays() + " Days");
    }
}
