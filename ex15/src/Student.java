public class Student extends People{
    private int studentNo;
    Student(String name,String ssn,int studentNo){
        super(name,ssn); // 부모 생성자 한번은 호출해야 하는 규칙
        this.studentNo = studentNo;
    }
    @Override
    public String toString(){
        return "name = "+
                getName()
                +" ssn = "+
                getSsn()
                +" studentNo = "+this.studentNo;
    }
}
