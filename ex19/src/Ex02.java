import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);        list.add(5);
        list.add(2);        list.add(10);        list.add(7);
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
//                if(num1>num2) return 1; else if(num1<num2) return -1; else return 0;
//                return num1-num2; // 오름차순
                return num2-num1;   // 내림차순
            }
        });
        list.sort( (num1, num2) -> num2-num1 );
        System.out.println(list);

        // javascript python
        int ary[] = new int[]{1,7,3,5,10};
        Arrays.stream(ary)
                .map( num -> num*2 )
                .filter( num -> num >=5 )
                .forEach(System.out::println);

//                Arrays.stream(ary)
//                .map( num -> num*2)
//                .forEach(System.out::println);
    }
}
