package com.company;

public class Constructed_language extends Language{

    String field;

    Constructed_language(String type, String name, String field) {
        super(type, name);
        this.field = field;
    }

    String info() {
        return "분야 : " + this.field + " / " + super.info();
    }

    String info(String user) {
        return "user : " + user + " / " + this.info();
    }

    void use() {
        System.out.print(this.field + " 분야에서 ");
        super.use();
    }

    void use(String user) {
        System.out.print(this.field + " 분야에서 ");
        super.use(user);
    }

}
