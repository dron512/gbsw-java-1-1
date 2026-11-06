package ex01;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();

        System.out.println(A.B.field2);
        A.B.method2();

        A.C c = new A.C();
    }
}
