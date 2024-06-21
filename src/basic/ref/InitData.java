package basic.ref;

public class InitData {
    int num;
    String str;
    boolean isTrue;


    public InitData() {

    }

    public InitData(int num, String str, boolean isTrue) {
        this.num = num;
        this.str = str;
        this.isTrue = isTrue;
    }

    public static void main(String[] args) {


        // int a;
        // System.out.println(a);
        // 기본 자료형은 직접 초기화를 해줘야함 (에러 뜸)


        InitData data = new InitData();
        
        // 인스턴스의 멤버 변수는 인스턴스 생성 시 자동 초기화
        System.out.println(data.num);  // 0
        System.out.println(data.str);  // null
        System.out.println(data.isTrue); // boolean


    }
}
