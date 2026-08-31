class A{}
class B{}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        int c = 10;
        // String 클래스만 new 연산자 없이 생성할 수 있습니다...
        String name1 = "전예성";
        String name2 = "전예성";
        String name3 = new String("전예성");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name2 == name3);
    }
}