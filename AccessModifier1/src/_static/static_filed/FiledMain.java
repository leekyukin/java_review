package _static.static_filed;

public class FiledMain {
    public static void main(String[] args) {

        Count c1 = new Count();

        c1.a++;
        c1.b++;


        System.out.println("===========c1 맴버변수============");
        System.out.println("일반 맴버변수 : " + c1.a);    // 1
        System.out.println("정적 맴버변수 : " + c1.b);    // 1

        Count c2 = new Count();

        c2.a++;
        c2.b++;

        System.out.println("===========c2 맴버변수============");
        System.out.println("일반 맴버변수 : " + c1.a);    // 1
        System.out.println("정적 맴버변수 : " + c1.b);    // 2

        // static 은 객체를 새로 생성해도 저장된 값을 유지한다.
    }
}
