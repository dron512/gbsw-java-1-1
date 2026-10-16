public class Computer extends Calcu{
    @Override
    public void areaCir(int r) {
        super.areaCir(10);
        System.out.println("Computer 넓이 구하기");
        System.out.println(Math.PI * r * r);
    }
}
