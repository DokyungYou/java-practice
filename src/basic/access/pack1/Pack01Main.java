package basic.access.pack1;

public class Pack01Main {
    public static void main(String[] args) {

        // 동일 패키지를 가진 클래스
        AccessData accessData = new AccessData();

        // public
        accessData.publicField = -1;
        accessData.publicMethod();

        // default
        accessData.defaultField = -1;
        accessData.defaultMethod();
        
        //private 접근 불가

        accessData.innerAccess(); // private 는 해당 클래스의 public or default 메서드로 접할 수 있음


        // ======================================================================================
        // class 접근 제어자 실습

        // 같은 패키지에 있는 클래스
        PublicClass publicClass = new PublicClass();

        DefaultClass01 defaultClass01 = new DefaultClass01();
        DefaultClass02 defaultClass02 = new DefaultClass02();

    }
}
