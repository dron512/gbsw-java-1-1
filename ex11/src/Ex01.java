import calcu.Calculate;

import java.util.Scanner;

// 다른 패키지에 있으면 import 구문 작성 해야 한다..

public class Ex01 {

    public static void main(String[] args) {

        System.out.println("main");

        int a = 10;

        // ctrl + tab 소스 위치 이동
        // ctrl + e 소스 파일 보여주고 나서 enter키 이동
        // ai... 클래스 calculate 만들어줘..

        // 문제..
        // 두수를 입력받아...
        // add 함수를 두개를 구현하는데
        // 1. add1 함수는 void return 값이 없도록 출력..
        // 2. add2 함수는 String return 값이 있고 출력..

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력?");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("숫자 입력?");
        int num2 = Integer.parseInt(sc.nextLine());

        Calculate c = new Calculate();
        c.add1(num1, num2);

        System.out.println("Ex01 main"+num1);
        System.out.println("Ex01 main"+num2);

//        System.out.println(c.add2(num1, num2));
//
//        String result = c.add2(num1, num2);
//        System.out.println(result);


    }
}
