package basic.access.pack2;

import basic.access.pack1.AccessData;

public class Pack02Main {
    public static void main(String[] args) {

        // 다른 패키지에 있는 클래스
        AccessData accessData = new AccessData();

        // public
        accessData.publicField = -1;
        accessData.publicMethod();

        // default 접근 불가
//        accessData.defaultField = -1;
//        accessData.defaultMethod();
        
        //private 접근 불가

        accessData.innerAccess(); // 허용되지 않는 접근 제어자의 요소들은 해당 클래스의 public 메서드로만 접할 수 있음
    }
}
