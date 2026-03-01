package p1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate this_labourDay = LocalDate.of(2021, Month.MAY, 1);
        LocalDate next_labourDay = this_labourDay.plusYears(1);
        LocalDate add_week = next_labourDay.plusDays(7);
        Period p = now.until(add_week);
        System.out.println(p);;
    }
}
