public class Product{
    int productNo;
    String name;
    int price;
    int sales;

    @Override
    public String toString() {
        return "Product{" +
                "productNo=" + productNo +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                '}';
    }
}