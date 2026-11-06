package ex02;
public class Ex02 {
  public static void main(String[] args) {
    AA aa = new AA(){
      @Override
      public void doA() {
        System.out.println("선생님..");
      }
    };
    aa.doA();
    AA aa1 = ()->{ System.out.println("선생님 2");  };
    aa1.doA();
    BB bb = new BB();
  }
}
