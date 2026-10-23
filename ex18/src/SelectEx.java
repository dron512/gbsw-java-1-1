import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx {
    private static final String URL
            = "jdbc:mysql://localhost:3306/java?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    public static void main(String[] args) {
        try{
            // db 연결하기
            Connection conn = DriverManager.getConnection(URL,"root","1234");
            System.out.println("DB 연결 성공");

            // sql 구문
            PreparedStatement pstmt
                    = conn.prepareStatement("select * from aa");

            // sql 구문 실행
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.print(rs.getString("name"));
                System.out.println(rs.getInt("score"));
            }
            System.out.println("sql 실행성공");
        }catch (Exception e) {
            System.out.println("DB 연결실패");
            e.printStackTrace(); // 예외 내용 출력
        }

    }
}
