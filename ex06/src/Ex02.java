import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int value = 5;
        int add = 5;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                arr[j][i] = value;
                value = value + add;
            }
            add--; value = add;
        }
        for (int i = 0; i < 5; i++)
            System.out.println(Arrays.toString(arr[i]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));
//        System.out.println(Arrays.toString(arr[3]));
//        System.out.println(Arrays.toString(arr[4]));
//        System.out.println(Arrays.toString(arr[5]));
    }
}
