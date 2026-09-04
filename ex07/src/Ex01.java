import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        // 가변적 배열
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        // 정적 배열
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr[i] = "+arr[i]);
        }
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
    }
}
