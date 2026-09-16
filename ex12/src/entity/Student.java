package entity;// setter getter
// toString...
// 생성자 오버로딩..

//접근제어지시자
// public -> 어디서든지 참조가능
// default -> 같은 패키지
// protected -> 상속
// public default protected private

// 자기자신만 참조 가능하다..
public class Student extends Person {
//    String name;
//    int age;
    public void setName(){
        name = "홍길동";
    }
}
