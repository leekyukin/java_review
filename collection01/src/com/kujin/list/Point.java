package com.kujin.list;

import java.util.*;

public class Point {

    public static Scanner sc = new Scanner(System.in);

    public static void showPointUI() {
        System.out.println("              ***성적표***");
        System.out.println("=========================================================");
        System.out.println("학번    이름    국어    영어    수학   총점   평균   학점");
        System.out.println("------------------------------------------------------");

    }


    public static void inputPoints(List<Student> students) {

    }

    public static void showAllPoints(List<Student> students) {

    }
    public static void searchPoints(List<Student> students) {

    }

    public static void modifyPoints(List<Student> student) {

    }

    public static void deletePoints(List<Student> students) {

    }



    public static void menuInfo() {

        System.out.println("\n*** 성적관리 프로그램 ***");
        System.out.println(" 1. 성적정보 입력");
        System.out.println(" 2. 전체성적 조회");
        System.out.println(" 3. 개별성적 조회");
        System.out.println(" 4. 성적정보 수정");
        System.out.println(" 5. 성적정보 삭제");
        System.out.println(" 6. 프로그램 종료");
        System.out.println("************************");
    }


}
