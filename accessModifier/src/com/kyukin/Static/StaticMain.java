package com.kyukin.Static;

public class StaticMain {
    public static void main(String[] args) {

        Count c1 = new Count();

        c1.a++;
        c1.b++;

        System.out.println("일반 맴버변수 : "+ c1.a);
        System.out.println("정적 맴버변수 : "+ c1.b);

    }
}
