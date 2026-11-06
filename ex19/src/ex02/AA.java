package ex02;

public interface AA {
  int AA = 10;
  // 몸체를 가질수 없다...
  void doA();
  // static default
  static void doB(){

  }
  default void doC(){

  }
  // command + z 뒤로 가기
  // command + shift + z 앞으로 가기
}
class BB{
  int AA = 20;
  void doB(){}
}
