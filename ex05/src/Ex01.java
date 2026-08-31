import java.util.Scanner;
/*
    Scanner로 숫자를 입력받아 숫자만큼 별을 출력하시오.
    예시 ) 4
    *
    * *
    * * *
    * * * *
    * * * *
    * * *
    * *
    *
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num 을 입력하세요");
        int num = sc.nextInt();
        System.out.println("num = " + num);
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("출력");
    }
}
