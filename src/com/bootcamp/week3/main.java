package com.bootcamp.week3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {




        /*List<String> companyNames = Arrays.asList(
                "Google",
                "Microsoft",
                "Amazon",
                "IBM"
        );
        //Stream Source
        Stream<String> stream = companyNames.stream();
        //Intermediate
        Stream<String> stream2 = stream.filter(name -> !name.isBlank());
        //Terminal
        List<String> listnames = stream2.collect(Collectors.toList());

        System.out.println(listnames);

        Optional<Integer> listnames2 = companyNames.stream()
                .filter(name -> !name.isBlank()) //Predicate
                .map(String::length) //Function
                .max((t,u) -> t-u); //Comparator

        int max = listnames2.get();

        System.out.println(max);
*/
    }
}