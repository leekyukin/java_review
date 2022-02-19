package com.kujin;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamTestMain {

    public static void main(String[] args) {

        int[] arr = {1,4,2,6,3,2,99,3,4,2,34,2,42,6,37,4,6,344,23,42,35,344,234,23,5,2,42,34, 100, 100 ,1000 ,000,};

        Arrays.stream(arr)
                .sorted()
                .filter(n -> n <= 99)
                .forEach(System.out::println);

        List<String> sList = new ArrayList<String>();
        sList.add("Kyujin");
        sList.add("jieon");
        sList.add("harin");

        Stream<String> stream1 = sList.stream();

        stream1.forEach(System.out::println);

        System.out.println();


        Stream<String> stream2 = sList.stream();
        stream2
                .sorted()
                .filter(s->s.equals("Kyujin"))
                .forEach(s-> System.out.println(s + "이용!"));

    }
}
