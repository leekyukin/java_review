package _final.final_filed;

public class Person {

    // final 변수는 한번 대입된 값은 변경할 수 없는 특징이 있기 때문에
    // 선언시 직접 초기화 하거나 생성자 통한 초기화 로직을 작성하여 반드시
    // 한번은 데이터가 저장되게 해야한다.

    public final String nation = "대한민국";
    public final String name;
    public int age;

    public Person (String name) {
//      this.nation = "중국"; -> final 이라 변경 불가!!
        this.name = name;
    }

}
