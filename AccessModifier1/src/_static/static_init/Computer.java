package _static.static_init;

public class Computer {

    public static String company = "Apple";
    public static String model = "M1 MacBook Pro";
    public static String info;
    public int price;

    public Computer() {
        System.out.println("생성자가 호출됨");
        this.price = 2650000;
        this.info = company + "-" +  model;
    }

//  정적 변수 초기화를 위해서는 정적 초기화자를 사용해야한다.
//  non-static 변수는 참조할 수 없다.
    static {
        System.out.println("정적 초기화자가 호출됨");
        info = company  + "-" + model;
    //  price = 10000000;   (X)
    }
}
