package ex01;

public class A {
    class B{
        int field1 = 20;
        void method1(){
            System.out.println("field1="+field1);
        }
        static int field2 = 30;
        static void method2(){
            System.out.println("field2="+field2);
        }
    }   // 인스턴스 중첩 클래스
    static class C{}    //정적(static) 중첩 클래스
    public void method1(){
        class D{
            static int cc = 20;
            static void method(){
                System.out.println("왜 될까...책에는" +
                    "안된다고 나오는데....");
            }
        } // 로컬 중첩 클래스

    }
}
