package com.kujin.list;




import java.util.ArrayList;
import java.util.*;

public class ArrayListMain {

    public static void main(String[] args) {
        // ArrayList 객체 생성
        // 제네릭(generic): 타입의 안정화를 위해 객체 내부에
        // 저장되는 타입을 일치시키는 방법
        List<String> list = new ArrayList<String>();


        String str1 = "Java";
        String str2 = "Python";

        System.out.println(list);

        // list에 객체를 저장하는 메서드 add() : 데이터를 맨끝에 저장
        list.add(str1);
        list.add(str2);
        list.add("DataBase");
        list.add("JDBC");
        list.add("Python");

        // 순서가 있고 중복저장 가능
        System.out.println(list);

        int size = list.size();
        System.out.println("list size : "+size);

        // list에 객체 삽입 add(index, 객체): 데티터를 원하는 자리에
        list.add(2,"Oracle");
        System.out.println(list);

        // 데이터 수정 set(insex, 객체)
        list.set(3, "MySQL");
        System.out.println(list);

        //list 내부 객체 가져오기 get(index)
        System.out.println(list.get(3)) ;

        // 인덱스번호 확인하기 indexOf(객체) : 검색 실패시 -1 return 함
        System.out.println("index of MySQL : "+list.indexOf("MySQL"));


        // 데이터 삭제 remove(index), remove(객체)
        list.remove(5);
        System.out.println(list);

        list.remove("Oracle");
        System.out.println(list);

        // 객체의 유무확인 contains(객체)
        System.out.println(str1);
        System.out.println("Java");
        System.out.println("Javascript");

        // list의 반복문 처리
        System.out.println("==================================");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("====================================");
        for(String str : list) {
            System.out.println(str);
        }
        System.out.println("=========================================");

        // 전부 삭제 clear()
        list.clear();
        System.out.println(list);


        // 데이터 비어있는지 확인 isEmpty()

        if (list.isEmpty()) {
            System.out.println("list is empty");
        }
        else {
            System.out.println("list is not empty");
        }
    }
}
