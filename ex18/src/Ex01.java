public class Ex01 {

    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);

            System.out.println("에러이면 이부분이 실행되지 않습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("종료됩니다.");
    }



}
