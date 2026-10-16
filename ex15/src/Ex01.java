// 3번째 클래스배열 -> 14일
// 4번째 상속...  -> 21일
// UML 클래스다어그램 -> 11월 첫째주...
// 3차 수행평가 javasciprt - mysql -> 11월 2~3째주...
   // java - mysql 연결..

public class Ex01 {
    public static void main(String[] args) {
//        Product p1 = new Product();
//        System.out.println(p1);

        // parkmyounghoi@sc.gyo6.net -> 공유

        // 2차 -> UML 클래스다이어그램
        // 3차 -> JAVA -> MYSQL - CRUD

        // 상품등록 -> insert
        // 상품삭제 -> delete
        Product products[] = new Product[5];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
        }
        products[0].productNo=1;
        products[0].name = "노트북";
        products[0].price = 1200000;
        products[0].sales = 5;

        products[1].productNo=2;
        products[1].name = "키보드";
        products[1].price = 80000;
        products[1].sales = 12;

        products[2].productNo=3;
        products[2].name = "마우스";
        products[2].price = 40000;
        products[2].sales = 20;

        products[3].productNo=4;
        products[3].name = "모니터";
        products[3].price = 350000;
        products[3].sales = 8;

        products[4].productNo=5;
        products[4].name = "헤드셋";
        products[4].price = 100000;
        products[4].sales = 15;

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        int 전체매출 = 0;
        int 전체판매량 = 0;

        for (int i = 0; i < products.length; i++) {
            int row = products[i].price * products[i].sales;
            System.out.println(row);
            전체판매량 = 전체판매량 + products[i].sales;
            전체매출 = 전체매출 + row;
        }
        System.out.println("전체판매량 "+전체판매량);
        System.out.println("전체매출 "+전체매출);

//        products[1] = new Product();
//        products[2] = new Product();
//        products[3] = new Product();
//        products[4] = new Product();


//
//        System.out.println(products[0]);
//        System.out.println(products[1]);
//        System.out.println(products[2]);
    }
}
