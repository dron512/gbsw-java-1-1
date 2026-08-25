package ex02_3;

public class CastingTest {
    public static void main() {
//        byte a = 10;
//        int b = a;  // 자동형변환
//
//        int c = -129;
//        byte d = (byte) c;  //강제형변환
//
//        System.out.println("b = "+ b);
//        System.out.println("d = "+ d);
        // vscode command + .
        // option + enter
        int a = 65;
        char b = (char) a;

        double d = 3.14;
        int e = (int) d;

        System.out.println("d = "+d);
        System.out.println("e = "+e);
    }
}
