import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySqlDBManager dbManager = new MySqlDBManager();
        while (true) {
            System.out.println("1. select 2. insert 3.update 4.delete 5.종료");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                dbManager.select();
            } else if (input == 2) {

                System.out.println("이름 입력: ");
                String name = scanner.nextLine();
                System.out.println("점수 입력:");
                int score = Integer.parseInt(scanner.nextLine());
                Student s = new Student(name, score);

                dbManager.insert(s);

            } else if(input==3){
                System.out.println("수정하고 싶은 번호 no를 입력: ");
                int no = Integer.parseInt(scanner.nextLine());
                System.out.println("no = "+no);
                // 수정
//                dbManager.update(no,);
            }else  if(input==4){
                // 삭제
            }else {
                System.out.println("종료됩니다.");
                break;
            }
        }
    }
}


