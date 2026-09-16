import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("""
                1. 차 등록
                2. 차 목록
                3. 등록된 차 중에서 빨간색인 차 개수
                4. 등록된 차들의 평균속도
                5. 종료 
                """);
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1){
                System.out.println("차등록");
            }
        }
    }
}
