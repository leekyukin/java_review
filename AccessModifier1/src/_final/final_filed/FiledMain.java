package _final.final_filed;

public class FiledMain {
    public static void main(String[] args) {

        Person lee = new Person("리큐킨");

//        lee.nation = "미국";  ->  final 변수
//        lee.name = "리무진";   ->  final 변수

        lee.age = 18;
        lee.age = 35;
    }
}
