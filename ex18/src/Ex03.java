import java.util.ArrayList;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("!");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String temp : list){
            System.out.println(temp);
        }

    }

}
