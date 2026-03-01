package p1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<String> elements =
                Arrays.asList("car", "truck", "car",
                               "bicycle", "car", "truck", "motorcycle");
        Map<String , Long> outcome =
                elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(outcome);
    }
}
