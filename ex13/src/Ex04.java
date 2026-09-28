import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        // 수요일 3교시 2차원배열
        // 다음주수요일.. 3교시.. 클래스배열
        /*
            100 90 85 100
            95 80 70 95
            100 29 50 40
         */
        int arr[][] = {
                {100, 90, 85, 100},
                {95, 80},
                {100, 50, 40},
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+"\t");
                total = total+ arr[i][j];
            }
            System.out.println((i+1)+" 번째 total = "+total);
            System.out.print((i+1)+" 번째 avg = ");
            System.out.printf("%.2f",(double)total/arr[i].length);
            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j]>=60){
                    count++;
                }
            }
        }
        System.out.println("60점 이상인것은 "+count+"개 입니다.");
    }
}
