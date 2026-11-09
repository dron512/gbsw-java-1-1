package ex04;
public class Ex02 {
  Parent p0 = new Parent(){
    int a = 10;
    public void doA(){ System.out.println("임의적으로 새로운메서드"); }
    public void parentMethod(){
      System.out.println(a);
      doA();
      System.out.println("새로운 정의 메서드");
    }
  };
  void method(){
//    System.out.println(p0.a);
//    p0.doA();
    p0.parentMethod();
  }
  public static void main(String[] args) {
    Ex02 ex02 = new Ex02();
    ex02.method();
//    System.out.println(ex02.p0.a);
//    ex02.p0.doA();
  }
}
