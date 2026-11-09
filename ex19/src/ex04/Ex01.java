package ex04;
/*
  jas
  const obj = {};
  obj.a = function(){};
 */
public class Ex01 {
  Parent p0 = new Parent();
  Parent p1 = new Parent(){
    @Override
    public void parentMethod(){
      System.out.println("클래스한번사용");
    }
  };
  public static void main(String[] args) {

//    p1.doA = ()->{}
//    p1.parentMethod();
    Inter inter = new Inter() {
      public void doA(){}
      @Override
      public void interMethod() {
        System.out.println("인터한번사용");
      }
    };
    inter.interMethod();
  }
}
