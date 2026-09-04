import java.util.Scanner;

/*
     학생수 입력
     학생수 만큼 점수를 입력받아
     총정 평균을 구하시오
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("학생 수 입력 : ");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("num = "+ num);
        int[] scores = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println((i+1)+" 번째 학생 점수 입력 : ");
            scores[i] = Integer.parseInt(input.nextLine());
        }
        int total = 0;
        for (int i = 0; i < num; i++) {
            System.out.println(scores[i]);
            total += scores[i];
        }
        System.out.println("총점 "+total);
        // 소수 둘째자리까지 출력
        System.out.println("평균 "+(double)total/num );
    }
}
