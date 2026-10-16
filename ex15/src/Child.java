public class Child extends Parent{
    @Override   // 재정의
    public void method2(){
        System.out.println("over method2222");
    }
    public void method3(){
        System.out.println("method3333");
    }

    @Override
    public String toString() {
        return "Child{ 재정의 }";
    }
}
