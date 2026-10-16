public class Ex01 {
    public static void main(String[] args) {
//        FlyMode.NORMAL = 30;
        SuperSonicAirPlane ssa = new SuperSonicAirPlane();
        ssa.takeOff();
        ssa.fly();

        ssa.setFlyMode(FlyMode.SUPERSONIC);
        ssa.fly();

        ssa.setFlyMode(FlyMode.NORMAL);
        ssa.fly();
        ssa.takeOff();
//        ssa.flyMode = FlyMode.SUPERSONIC;
    }
}
