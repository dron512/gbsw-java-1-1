public class Student {
    String name;
    int age;
    int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //생성자 오버로딩...

    // 기본생성자
    // 생략 가능 하다....
    public Student() {
//        this.name = "홍길동";
//        this.age = 20;
    }
    public Student(int age) {
    }
    // 다른 생성자...
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("기본생성자가 아닌 다른생성자");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}


