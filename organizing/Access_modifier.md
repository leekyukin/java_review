# 접근제한자 (Access modifier)

## static 

    새로운 객체를 생성하면 전에 만들었던 객체에 저장되어 있던
    값이 그대로 저장되어 생성된다.


```java

public class c1 {
    
    // 일반 맴버 변수
    public int a;

    // 정적 맴버 변수
    public static int b;
}

public class main {
    public static void main(String[] args) {
        c1 oldC1 = new c1();
        // 변수   |  결과
        oldc1.a++; // 1
        oldc1.b++; // 1

        c1 newC1 = new C1();
        // 변수   |  결과
        newC1.a++; // 1
        newC1.b++; // 2  
        // ㄴ> static 맴버변수인 b는 oldC1의 값이 누적되어 연산된다.
        
    }
}
```


