public class BB {
    // 반복적인 편하게 사용하기 위해서
    // doAA 함수를 호출하면서
    // 10을 보내게 되면
    // 1~10까지 더해서출력
    // 5를 보내게 되면 1~5까지 더해서 출력
    // 3을 보내게 되면 1~3까지 더해서 출력
    public void doAA(int num) {
        int sum = 0;
        for (int i = 1; i < num + 1; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    // 기본 값 복사 메서드
    public void doA(int num) {

    }

    // 참조 값(주소값) 복사 메서드
    public void doB(int[] arr) {

    }
}
