import java.util.Calendar;

/*
    인스턴스멤버
    insnum1, insnum2,
    insplus(), insminus()
    정적멤버
    stanum1, stanum2,
    staplus(), staminus()
 */
public class Ex02 {
    public static void main(String[] args) {
        System.out.println(Calculator.stanum1);
        System.out.println(Calculator.stanum2);

        // 스태틱 메서드로 덧셈,뺼셈 만들기,
        // Calculator.insplus()

//        System.out.println(Calendar.insnum1);
        // 인스턴스 메서드로 덧셈,뺄셈 만들기

        Calculator c = new Calculator();
        System.out.println(c.insnum1);
        System.out.println(c.insnum2);
    }
}
