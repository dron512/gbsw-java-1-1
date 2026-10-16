public class BB extends AA{
    BB(){
//        super();
        System.out.println(a);
        System.out.println(b);
    }
    public BB(String a, String b) {
//        super();
        // 다른 생성자 선언시 기본생성자 생략 불가
        this(); // 기본생성자 없는데???
//        this(10);
        this.a = a;
        this.b = b;
    }
    public void doB(){
        System.out.println("BB doB");
    }
}
