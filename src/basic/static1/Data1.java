package basic.static1;


public class Data1 {
    private String name;
    private int count;

    public Data1(String name){
        this.name = name;


        // 생성된 객체의 누적된 수를 원한다.
        // 하지만 이러면..? 매번 1
        // 인스턴스변수이기때문에 객체가 생성될때마다 새로 만들어지기 때문 (개별된 값임)
        count++;
    }

    public int getCount() {
        return count;
    }
}
