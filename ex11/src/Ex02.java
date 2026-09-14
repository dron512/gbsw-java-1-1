public class Ex02 {

    public static void main(String[] args) {

        AA aa = new AA();
        AATest test = new AATest();
        test.doA(aa);

        System.out.println("Ex02.aa = "+aa);
        System.out.println("main aa.num = "+aa.num);

    }
    // 기본형 복사
    // 메소드 호출시에 값을 복사
    // call by value..
    // 참조형 복사
    // 메소드 호출시에 주소값을 복사
    // call by reference...
}
