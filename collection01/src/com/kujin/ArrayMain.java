package com.kujin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {


        // 1. 배열의 선언 - stack에 배열변수를 설정.
        int[] score;

        // 2. 배열의 생성 - Heap에 실제 데이터가 저장될 영역 설정.
        score = new int[5];

        // 주소값
        System.out.println(score);

        // 3. 배열의 초기화 - 배열에 값을 저장하는 과정
        score[0] = 87;
        score[2] = 99;
        score[3] = score[0];

        // 4. 배열의 참조(사용)
        System.out.println("배열의 3번째 데이터 값 : " + score[2]);

        System.out.print("All of score -> ");
        for(int num : score) {
            System.out.print(num+" ");
        }
        System.out.println();
        /*
            배열 내부에 저장된 값을 한눈에 문자열 형태로
            확인해보려면 출력메서드 println의 매개값으로
            Arrays.toString(배열변수명)을 쓰면 된다.
         */
        System.out.println(Arrays.toString(score));

        // 배열의 길이
        System.out.println("배열의 길이 : " + score.length);

        // 선언과 생성 동시
        byte[] bArr = new byte[7];

        // 선언과 생성, 초기화 동시에
        char[] letters = new char[] {'A', 'B', 'C', 'D'};
        System.out.println(Arrays.toString(letters));
    }
}
