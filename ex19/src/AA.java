/*
 변수와 메서드로 구현이 되어 지는데
 변수를 선언하게 되면
  public static final 선언되어 진다.
 메서드 선언하게 되면
  몸체가 없이 만들어진다.
 */
class BB{ int A = 10; }
public interface AA {
    int A=10;
    void doA();
    // 자바 1.8 추가...
    // static 메서드와 default 메서드가 있다.
    // 쌀먹...??? 날먹..?????
    // 바로 호출 가능하다..
    static void doB(){
        System.out.println("AA static doB");
    }
    // 객체 생성해야 호출 가능하다..
    default void doC(){
        System.out.println("AA default doC");
    }
}
//interface AAA{ void doAAA(); }
// 인터페이스는 규격을 정의 한다...
class CC implements AA{
    @Override
    public void doA() {
        System.out.println("CC doA");
    }
}
