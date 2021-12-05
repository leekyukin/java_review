package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------걍 언어-------------------");
        Language lg = new Language("비밀", "비밀");
        System.out.println(lg.info());
        lg.use();
        System.out.println("---------------자연어----------------");

        Natural_language NL = new Natural_language("자연어","한국어", "대한민국");
        System.out.println(NL.info());
        NL.use();
        System.out.println("-----------------사용자----------------");
        NL.use("이규진");
        System.out.println(NL.info("이규진"));

        System.out.println("--------------인공언어-------------------");
        Constructed_language CL= new Constructed_language("인공언어", "JAVA", "web");
        System.out.println(CL.info());
        CL.use();
        System.out.println("-------------사용자------------------------");
        System.out.println(CL.info("이하린"));
        CL.use("이하린");

    }
}
