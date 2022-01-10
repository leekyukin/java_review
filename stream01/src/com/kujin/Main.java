package com.kujin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5); // 배열을 리스트로
        Stream<Integer> intStream = list.stream();  // 리스트를 Integer 참조형 스트림으로

        intStream.forEach(System.out::println);
    //  intStream.forEach(System.out::println); error : stream has already been operated upon or closed
    //  스트림은 한번 쓰고 나면 버려지는 소모형 (다시 못씀)

    }
}
