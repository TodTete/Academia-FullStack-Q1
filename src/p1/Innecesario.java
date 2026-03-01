package p1;

import java.util.List;

public class Innecesario {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = listOfNumbers.parallelStream().reduce (5, Integer::sum);
        System.out.println(sum);
    }
}
