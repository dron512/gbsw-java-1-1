package ex05;

public class Anonymous {
  Person p1 = new Person();
  //필드
  Person field = new Person(){
    public void work(){
      System.out.println("일을 해야 돈을 벌고 먹고 살 수 있어요");
    }
    public void wake(){
      System.out.println("8시에 일어납니다.");
      work();
    }
  };
  //메서드지역변수
  void method(){
    Person field = new Person(){
      public void work(){
        System.out.println("AI를 사용하나여?");
      }
      public void wake(){
        System.out.println("9시에 일어납니다.");
        work();
      }
    };
    field.wake();
  }
  //메서드매개변수
  void method2(Person p){
    p.wake();
  }
}
