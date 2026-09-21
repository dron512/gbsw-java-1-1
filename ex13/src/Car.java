public class Car {

    // static(정적) 변수
    static int AA = 10;

    // 인스턴스 변수
    int speed;
    String model;

    // static 메서드
    static void run(){
        System.out.println("Car is running");
    }

    // 인스턴스 메서드
    void setSpeed(int speed){
        this.speed = speed;
    }
}
