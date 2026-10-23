import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEx {

    private static final String URL
            = "jdbc:mysql://localhost:3306/java?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    public static void main(String[] args) {
        try{
            // 데이터베이스 연결하기
            Connection conn
                = DriverManager.getConnection(URL,"root","1234");
            System.out.println("DB 연결 성공");
            // sql 구문
            PreparedStatement pstmt = conn.prepareStatement("""
                                            insert into aa
                                                (name,score)
                                            values
                                                ('찬열',100);
                                            """);
            // sql 실행
            pstmt.executeUpdate();  // 실행...
            System.out.println("sql 실행 성공");
        }catch (Exception e){
            System.out.println("DB 연결 실패");
            e.printStackTrace();
        }
    }

}
