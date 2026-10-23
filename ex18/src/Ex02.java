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
            System.out.println("1. select 2. insert");
            int input = scanner.nextInt();
            if (input == 1) {
                dbManager.select();
            } else if (input == 2) {
                dbManager.insert();
            } else if(input==3){
                // 수정
//                dbManager.update();
            }else  if(input==4){
                // 삭제
            }
            else {
                System.out.println("종료됩니다.");
                break;
            }
        }
    }
}
