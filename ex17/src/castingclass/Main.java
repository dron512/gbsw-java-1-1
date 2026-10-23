package castingclass;

public class Main {
    public static void main(String[] args) {
        AA bb = new BB();
        AA cc = new CC();

        BB bbs[] = new BB[2];
        CC ccs[] = new CC[2];

        AA aas[] = new AA[4];
        aas[0] = new BB();
        aas[1] = new BB();

        aas[2] = new CC();
        aas[3] = new CC();

        // 강제 타입 변환 instanceOf 사용..
        if (aas[0] instanceof BB){
            BB temp = (BB) aas[0];
            temp.doBB();
        }
        else if(aas[0] instanceof CC ){
            CC temp = (CC) aas[0];
            temp.doCC();
        }
//        aas[0].doBB();

//        AA aary[] = {bb,cc};
    }
}
