package static_init;

public class InitMain {
    public static void main(String[] args) {
        
        Computer com = new Computer();
                                     // 출력값
        System.out.println(com.info);//  null
        // ㄴ> 생성자가 호출되지 않았기때문에 info 의 값이 비어있음
        // So, 정적 초기화자를 사용해야한다.

        // 정적 초기화자를 호출하려면 클레스를 로딩해야 한다.
        // 클레스 로딩 방법
        // 1. 객체를 생성
        // 2. 클레스 이름을 통해 정적 맴버에 접근

        System.out.println(Computer.info);
    }
}
