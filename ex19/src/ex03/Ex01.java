package ex03;

public class Ex01 {
  public static void main(String[] args) {

    Button button = new Button();
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick() {
        System.out.println("코딩 공부를 합니다.");
      }
    });
    button.touch();
    button.setOnClickListener(()->{
      System.out.println("수학 공부를 합니다.");
    });
    button.touch();


  }
}
