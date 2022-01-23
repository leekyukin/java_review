# static 


## 정적 맴버변수 (Static Member Variable) 

- 새로운 객체를 생성하면 전에 만들었던 객체에 저장되어 있던 값이 그대로 저장되어 생성된다.
- 기본적으로는 Heap역역에 클레스들이 생성되지만 static 맴버변수는 Data역역에 따로 생성되어 모든 클레스에서 공유한다.


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
        oldC1.a++; // 1 
        oldC1.b++; // 1

        c1 newC1 = new C1();
        // 변수   |  결과
        newC1.a++; // 1
        newC1.b++; // 2  
        // ㄴ> static 맴버변수인 b는 oldC1의 값이 누적되어 연산된다.
        
        System.out.println(oldC1.b);    // 2
        System.out.println(newC1.b);    // 2
        System.out.println(C1.b);       // 2
    }
}
```
### 모두 같은 Data영역에 있는 C1의 변수 b를 **공유**한다.
---

```java
public class main {
    static void main(String[] args) {

        C1 test = new C1();

        // test.b (X)
        C1.b++;

    }
}
```
### static 맴버변수는 객체와 무관하기 때문에 클레스 이름만으로 참조하여 사용한다.

--- 

## 정적 메서드 (Static Method)

- static 메서드 내부에서는 static이 붙은 변수나 메서드만 참조할 수 있다.
- static 메서드 내부에 non-static 메서드를 참조하려면 객체 생성을 통해서 참조해야한다.

```java

public class Count {

    public int a;
    public static b;

    // 일반 메서드
    // 일반 메서드는 일반 맴버변수나 정적 맴버변수 모두 참조 가능하다.
    public void method1() {
        a = 10;
        return a + b;
    }

    // 정적 메서드
    public static void method2() {

        // a = 10;  (X)

        // 이렇게 객체를 생성해야만 non-static 변수를 사용 가능하다.
        Count c = new Count();
        c.a = 10;
        return c.a + b;
    }
}
```

- 정적 메서드는 객체 생성없이 이름만으로 직접 참조가 가능하다.

```java

public class Main {
    public static void main(String[] args) {

                                        //    출력값  
        System.out.println(Count.method2()); // 10
        Count.b += 50;
        System.out.println(Count.method2()); // 60
        Count.b -= 20;
        System.out.println(Count.method2()); // 40

        // System.out.println(Count.method1()); (X)
        Count C1 = new Count();
        C1.a = 10;

    }
}

```