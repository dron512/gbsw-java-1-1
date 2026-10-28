import java.util.ArrayList;
import java.util.List;

public class Ex04 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("박석민",100));
        list.add(new Student("김석민",90));
        list.add(new Student("이석민",70));
        list.add(new Student("장석민",60));

        for (Student s :list){
            System.out.println(s);
        }

        int total = 0;

        // 최대값은 list에 0번째 넣기
        int max = list.get(0).getScore();

        // 최소값은 list에 0번째 넣기
        int min = list.get(0).getScore();

        for (Student s :list){
            if (max < s.getScore())
                max = s.getScore();
        }

        System.out.println("최대 점수"+ max);

        for (Student s :list){
//            System.out.println(s.getScore());
            total = total + s.getScore();
            System.out.println("변화"+total);
        }

        System.out.println(total);


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


    }

}
