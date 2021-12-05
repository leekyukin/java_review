package com.company;

public class Language {
    String type;
    String name;

    Language() {}

    Language(String type, String name) {
        this.type = type;
        this.name = name;
    }

    String info() {
        return "type : " + type + " / name : " + name;
    }

    String info(String user) {
        return "user : " + user + " / " +this.info();
    }

    void use() {
        System.out.println(name + "(을)를 사용합니다.");
    }

    void use(String user) {
        System.out.print(user+"(이)가 ");
        this.use();
    }
}
