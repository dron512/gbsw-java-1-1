import java.util.Calendar;

public class Ex03 {
    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();
        System.out.println(s1);
        System.out.println(s2);

        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
        System.out.println(s3);
        System.out.println(s4);

        Calendar c1 = Calendar.getInstance();
        // 현재 시간 출력하기
        System.out.println(c1.getTime());
    }
}

class AAAA{
    public void doA(){
        Singleton s1 = Singleton.getInstance();
    }
}
//class BBB{
//    public void doB(){
//        Singleton s1 = new Singleton();
//    }
//}
