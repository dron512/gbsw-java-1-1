import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        // 학생 5명을 배열로 선언하고
        // 100,70,80,60,90 점을 입력받아
        // 성적평균을 만들고,,
        // 70점이상인 사람이 몇명인지 구해라

        Student srr[] = new Student[5];
        System.out.println(Arrays.toString(srr));

        for (int i = 0; i < 5; i++) {
            srr[i] = new Student();
        }

        System.out.println(Arrays.toString(srr));


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+"성적 입력");
            int score = Integer.parseInt(sc.nextLine());
        }
    }

}
