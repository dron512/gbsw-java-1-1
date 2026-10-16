package ex03;

public class Ex04 {

    public static void main(String[] args) {

        SportsCar sportsCar = new SportsCar();
        sportsCar.upSpeed();
        System.out.println("스포츠카 = "+sportsCar.speed);

        Car car = new Car();
        car.upSpeed();
        System.out.println("카 = "+car.speed);

    }

}
