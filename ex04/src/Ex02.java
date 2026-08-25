import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        /*
            Scanner 를 사용하여 무한히 입력받기...
         */
        while(true){
            System.out.println("무한 루프");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            System.out.println("a = "+a);
            if(   a.equals("exit")   ){
                break;
            }
        }

    }
}
