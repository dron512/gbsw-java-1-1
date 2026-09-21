public class Ex01 {
    public static void main(String[] args) {
        // 모든 변수는 메모리에 올려서 사용해야한다..
        // 스택 영역에 올려놓고 사용합니다.
        int a=10;
        System.out.println(a);

        // 메소드 영역에 올려놓고 사용합니다
        System.out.println(Car.AA);
        Car.run();
        // 인스턴스 메서드는 객체 생성해서
        // 힙영역에 할당해야 사용할 수 있다.
//        Car.setSpeed(50);

//        System.out.println(Car.speed);

        Car c1 = new Car();
        System.out.println(c1.speed);
        System.out.println(c1.model);
        c1.setSpeed(100);

    }

}
