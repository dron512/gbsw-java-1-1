package castingclass;

public class Example {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.field1);
        p.method1();
        p.method2();
        // 강제 타입 변환...
        Child c = (Child) p;
        System.out.println(c.field2);
        c.method3();
    }
}
