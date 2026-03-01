package p1;

import java.util.function.Predicate;

public class TestApp {
    public static void main(String[] args) {
        int x = 10, grade =1;
        if (x > 5) {
            grade = 1;
        }else if (x > 8) {
            grade = 2;
        }
        Predicate<Integer> pred = g -> g == 2;
        System.out.println("Is it grade 2?" + pred.test(grade));
    }
}
