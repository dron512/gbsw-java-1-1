package ex02;

public class Ex01 {
  public static void main(String[] args) {
    /*
      인터페이스 변수 와 메서드 선언...
     */
    System.out.println(AA.AA);

//    System.out.println(BB.AA);// interface와 class 차이...
    BB bb = new BB();
    System.out.println(bb.AA);
// 변경 불가 final 예약어 때문에...
//    AA.AA = 20;

  }
}
