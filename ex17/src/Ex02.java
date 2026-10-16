import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

//        Student student1 = new Student("홍길동",70,1);
        list.add(new Student("홍길동", 70, 1));
//        Student student2 = new Student("박길동",60,2);
        list.add(new Student("박길동", 60, 2));
//        Student student3 = new Student("김길동",50,3);
        list.add(new Student("김길동", 50, 3));

        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
            Student s1 = list.get(i);
//            System.out.println(" 이름 = "+s1.getName());
//            System.out.println(" 점수 = "+s1.getScore());
//            System.out.println(" 번호 = "+s1.getStudentNo());

            System.out.println(s1);
        }

        int total = 0;
        int avg = 0;

        for (Student s : list) {
            total = total + s.getScore();
        }

        System.out.println("점수 총합 : " + total);
        System.out.println("평균 : " + total / list.size());

        int count = 0;
        for (Student s : list) {
            if (s.getScore() >= 60) {
                count++;
            }
        }
        int max = list.get(0).getScore();
        for (Student s : list) {
            if (s.getScore() > max) {
                max = s.getScore();
            }
        }
        System.out.println("최고 점수 : " + max);

        System.out.println("60점 이상인 수 : " + count);
        System.out.println(list);
    }
}
