import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // 숫자를 문자열로 바꾸는거
        // 문자열을 숫자로 바꾸는거
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("a = " + a);
//        String b = a+"";
        String b = String.valueOf(a);
        System.out.println("문자열 덧셈" + b + 5);
        int c = Integer.parseInt(b) + 5;
        System.out.println("c = " + c);

        try {
            System.out.println(Integer.parseInt("1a"));
            System.out.println("실행");
        }catch(Exception e){
            System.out.println("예외");
        }

    }
}
