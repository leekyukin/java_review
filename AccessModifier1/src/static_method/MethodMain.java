package static_method;

public class MethodMain {
    public static void main(String[] args) {

        // static 맴버는 객체 생성없이 이름만으로 직접 참조가 가능하다.

        System.out.println(Count.method2());

        Count.b += 50;
        System.out.println(Count.method2());
        Count.b -= 20;
        System.out.println(Count.method2());

        // System.out.println(Count.method1()); (X)
        Count C1 = new Count();
        C1.a = 10;

    }
}
