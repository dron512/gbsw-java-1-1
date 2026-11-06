public class Ex01 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb.A);
        System.out.println(AA.A);
//        AA.A = 20;
        System.out.println(AA.A);
//        AA.doA();
        // 호출 불가 static이 아니고
        // 안에 표현되어진게 없기 떄문에

        // 1. implements 를 해서 구현해서 사용
        // 2. 익명 new 사용하면서 구현해서 사용..
        CC cc = new CC();
        cc.doA();

        AA aa = new AA(){
            public void doA(){
                System.out.println("AA doA");
            }
        };
        aa.doA();
        aa.doC();
        AA.doB();
    }
}
