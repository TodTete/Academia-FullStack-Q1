package p1;

import java.util.stream.Stream;

public class ocho {
    public static void main(String args[]) {
        Stream.of(3,6,9,12,15,18,21,24,27)
                .takeWhile(s -> s % 3 == 0)
                .dropWhile(s -> s % 2 == 0)
                .limit(3).forEach( s -> System.out.print(s + " "));
    }
}
