public class BB extends AA{
    BB(){
//        super();
        super(10); // 생략되어진 표현입니다.
        // 부모 생성자는 무조건 한번 호출 해야 된다.
        System.out.println("BB 생성자");
    }
}
