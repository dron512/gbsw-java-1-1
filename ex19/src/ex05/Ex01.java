package ex05;

public class Ex01 {
  public static void main(String[] args) {
    Anonymous ano = new Anonymous();
//    ano.field.wake();
//    ano.p1.wake();
//    System.out.println();
//    ano.method();
//    Person pp = new Person();
//    Report report = new Report();
//    ano.method2(pp);
    ano.method2(new Person(){
      public void work(){
        System.out.println("사람이 공부를 하고 일을 해야 먹고 사는 거예요");
      }
      @Override
      public void wake() {
        System.out.println("메서드 바꾸기");
        work();
      }
    });
  }
}
