package basic.extends0.super02;

public class SuperMain {
    public static void main(String[] args) {

        // C-> B-> A 상속관계 상태
        // C 생성자 호출 시 A생성자 -> B생성자 -> C생성자 순으로 실행이 완료됨을 알 수 있음
        ClassC classC = new ClassC();
    }
}
