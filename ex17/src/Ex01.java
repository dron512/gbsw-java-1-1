import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        list[0] = 10;
        list.add(10);
        list.add(20);
        list.add(30);
        // 오토박싱... int -> Integer

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        for( int temp: list)
            System.out.println(temp);

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

        System.out.println("list.size = "+list.size());
    }
}
