package final01;

public class FinalRefMain {
    public static void main(String[] args) {

        final Data data = new Data();
        // data = new Data(); 재할당 불가

        // 참조 대상의 값은 변경 가능
        // data 라는 변수에 final 을 부여한 것 (참조값만 바꿀 수 없는 것)
        data.value = 1;
    }
}
