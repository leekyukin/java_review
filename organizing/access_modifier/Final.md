# <span style="color:orange">final</span>
- <span style="color:wheat">final 변수는 한번 대입된 값은 변경할 수 없는 특징이 있기 때문에 선언시 직접 초기화 하거나  
  생성자 통한 초기화 로직을 작성하여 반드시 한번은 데이터가 저장되게 해야한다.</span>

## <span style="color:orange">Class</span>

```java
public class Person {

    public final String nation = "대한민국";
    public final String name;
    public int age;

    public Person (String name) {
//      this.nation = "중국"; -> final 이라 변경 불가!!
        this.name = name;
    }
}
```
 ## <span style="color:orange">Main</span>

```java



```java
public class FiledMain {
    public static void main(String[] args) {

        Person lee = new Person("리큐킨");

//        lee.nation = "미국";  ->  final 변수
//        lee.name = "리무진";   ->  final 변수

        lee.age = 18;
        lee.age = 35;
    }
}
```


