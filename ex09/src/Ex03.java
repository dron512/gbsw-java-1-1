public class Ex03 {
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = stud1;

        stud1.name = "홍길동";

        String aa = "aa";
        String bb = new String("aa");
        String cc = aa;

        System.out.println(stud1==stud2);
        System.out.println(stud1==stud3);

        System.out.println(stud1.name);
        System.out.println(stud2.name);
        System.out.println(stud3.name);
    }
}
