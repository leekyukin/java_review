package static_method;

public class Count {

    public int a;
    public static int b;

    // 일반 매서드
    // 일반 메서드 안에서는 일반 맴버변수와 정적 맴버변수를 모두 참조할 수 있다.
    public int method1() {
        a = 10;
        return a + b;
    }


    // 정적 메서드
    // static 메서드 내부에서는 static 이 붙은 변수나 메서드만 참조할 수 있다.
    // static 메서드 내부에 non-static 메서드를 참조하려면
    // 객체 생성을 통해서 참조해야한다.
    public static int method2() {
        // a = 10;
        Count C = new Count();
        C.a = 10;
        return C.a + b;
    }



}
