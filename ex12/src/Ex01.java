import entity.Car;
import entity.Student;

import java.util.Scanner;
import java.lang.*;

/*
    다른 패키지에 있는것은.....
    가지고 올때
    import 구문을
    작성해야한다..
    java.lang.*; 생략가능하다...
*/

// java,javax 로 시작하는것은 oracle 만들어준

//import javax.crypto.interfaces.

// 1차 2번째꺼 이차원배열
// 다른패키지에 있으면 import 구문을 적어야한다.

// String java.lang 은 import 구문이 생략 되어져있습니다
public class Ex01 {
    public static void main(String[] args) {
//        String
        Scanner sc = new Scanner(System.in);
                              
        Student s1 = new Student();
        // 참조 불가능하다...
//        s1.name ="박길동";

        Car c1 = new Car();
        System.out.println(c1);

        Car c2 = new Car("쏘나타","검정색",80);
        System.out.println(c2);

        c2.setModel("k5");
//        System.out.println(c2);
//        System.out.println(c2.model);
        System.out.println(c2.getModel());
//        c2.model = "K5";

        // 참조 불가능하다...
//      c1.model= "쏘나타";

//      Car cars[] = new Car[10];

//        System.out.println("너무 어려워요");

        // 1차 수행평가 3번째...
        // 배열 10개의 크기를 선언하여
        // 1. 차 등록
        // 2. 차 목록보기
        // 3. 차 색상이 빨간색인거의 개수
        // 4. 등록된 자동차의 평균속도
        // 5. 종료


    }
}
