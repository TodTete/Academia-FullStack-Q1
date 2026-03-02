package p1;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Locale.*;

public class answer {
    public static void main(String[] args) {

    List<Integer> l1 = List.of(1, 3, 5, 7, 9);
    List<Integer> l2 = List.of(2, 4, 6, 8);
    List<List<Integer>> l3 = List.of(l1, l2);
    //Line n1

    List<Integer> l4 = l3.stream().flatMap(x -> x.stream()).filter(y -> y > 5).collect(Collectors.toList());

    System.out.println(l4);

    }
}