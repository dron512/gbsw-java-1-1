package ex03;

public class Car {
    int speed = 0;

    public void upSpeed () {
        speed += 1;
    }

    public final void stop(){
        System.out.println("차를 멈춤니다");
        speed = 0;
    }

}
