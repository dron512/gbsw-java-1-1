public class Main {

    public static void main(String[] args) {

        int[][] stock = {
                {10, 5, 8, 2},
                {7, 12, 3, 6},
                {4, 9, 15, 1}
        };

        System.out.println("[전체 재고 현황]");
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                System.out.print(stock[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\n[상품별 총 재고]");
        int product[] = new int[3];

        for (int i = 0; i < stock.length; i++) {
            int total = 0;
            for (int j = 0; j < stock[i].length; j++) {
                total += stock[i][j];
            }
            product[i] = total;
            System.out.println(i+1+"번 상품 "+total+"개");
        }

        System.out.println("\n[구간별 총 재고]");

        for (int j = 0; j < 4; j++) {
            int total = 0;
            for (int i =0; i< 3; i++){
                total += stock[i][j];
            }
            System.out.println(j+1+"번째 구역 "+total+"개");
        }

        int total = 0;
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                total += stock[i][j];
            }
        }
        System.out.println("\n전체 재고 수량 : "+total+"개");




    }

}
