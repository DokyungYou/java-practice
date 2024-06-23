package basic.static1;

public class Data3 {

    public String name;

    // Data3의 여러 인스턴스들에서 공용으로 사용할 수 있는 변수
    // static 변수, 정적 변수 , class 변수
    public static int count;

    public Data3(String name) {
        this.name = name;

        // static 변수 자신이 속한 클래스 내부이니까 굳이 Data3.count 형식으로 사용할 필요는 없음
        count++;
    }
}
