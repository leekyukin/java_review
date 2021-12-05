package com.company;

public class Natural_language extends Language {

    String nation;

    Natural_language(String type, String name, String nation) {
        super(type, name);
        this.nation = nation;
    }




    String info() {
        return super.info() + " / nation : " + this.nation;
    }

    void use() {
        System.out.print(this.nation + "에서 ");
        super.use();
    }

    void use(String user) {
        super.use(user);

    }
}
