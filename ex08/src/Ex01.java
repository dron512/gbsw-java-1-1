import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // 배열..
        // 1. 배열의 크기를 입력받아 배열을 할당하고
        // 2. 배열의 크기만큼 점수 입력 받고 출력 하는 것까지 연습
        Scanner sc = new Scanner(System.in);
        System.out.println("배열을 크기를 입력 하세요");
        int num = Integer.parseInt(sc.nextLine());

        int[] arr = new int[num];
        System.out.println("arr.length = "+ arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+"번째 점수 입력 하세요");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
