public class SuperSonicAirPlane extends AirPlane {
    private int flyMode = FlyMode.NORMAL;
    public int getFlyMode() {
        return flyMode;
    }
    public void setFlyMode(int flyMode) {
        this.flyMode = flyMode;
    }
    //    public int getFlyMode() {
//        return flyMode;
//    }
//    public void setFlyMode(int flyMode) {
//        this.flyMode = flyMode;
//    }

    @Override
    public void fly() {
        if(flyMode == FlyMode.SUPERSONIC)
            System.out.println("초음속 비행합니다.");
        else
            super.fly();
    }
}
