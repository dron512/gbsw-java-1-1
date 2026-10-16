package ex03;


public class SportsCar extends Car{

    @Override
    public void upSpeed() {
        speed +=10;
    }

//    @Override
//    public final void stop(){
//        System.out.println("차를 멈춤니다");
//        speed = 0;
//    }
}
