package p1;

import java.time.*;
import java.time.format.*;
public class Test {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021, Month.JANUARY, 1);
        LocalDate d2 = d1.plus(Period.ofDays(-10)).withMonth(1);
        LocalDateTime ldt = d2.atTime(LocalTime.of(11,11));
        if (d1.isAfter(d2) ^! d1.getMonth().equals(ldt.getMonth())) {
            ldt = d2.atTime(LocalTime.of(12, 12));
        }
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("HHMM")));;
    }
}
