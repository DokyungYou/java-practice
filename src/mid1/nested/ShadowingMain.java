package mid1.nested;

public class ShadowingMain {

    public String value = "바깥클래스 멤버변수";
    class Inner{
        String value = "이너 클래스 멤버변수";

        void printValue(){
            String value = "이너클래스 지역변수";

            // 섀도잉: 동일한 이름의 다른변수에 의해 가려지는 것
            System.out.println("지역변수: " + value);
            System.out.println("멤버변수(자기 클래스): " + this.value);
            System.out.println("멤버변수(바깥 클래스): " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();
        inner.printValue();
    }
}
