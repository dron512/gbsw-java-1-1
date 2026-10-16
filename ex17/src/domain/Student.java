package domain;

public class Student {

    private String name;
    private int score;
    private final int studentNo;

    @Override
    public String toString() {
        return " 이름 ='" + name + '\'' +
                ", 점수 =" + score +
                ", 번호 =" + studentNo
               ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getStudentNo() {
        return studentNo;
    }
    // final 이기 때문에 setStudentNo() 메서드는 필요 없습니다.

    public Student(String name, int score, int studentNo) {
        this.name = name;
        this.score = score;
        this.studentNo = studentNo;
    }
}
