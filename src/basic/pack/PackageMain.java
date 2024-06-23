package basic.pack;

import basic.pack.package1.Member;

public class PackageMain {

    public static void main(String[] args) {

        // 같은 basic.pack 패키지 내에 있는 Data 클래스는 import 필요없음
        Data data = new Data();

        // 다른 패키지 (basic.pack.package1) 에 있는 Member 클래스는 import 를 하거나 매번 사용 시 패키지 경로를 같이 적어줘야함
//        basic.pack.package1.Member member = new basic.pack.package1.Member();



        /*
         만약 서로 다른 패키지인데 이름이 같은 클래스를 한 파일에서 사용할 경우
         ex)
            basic.pack.package1.Member
            basic.pack.Member

        적어도 둘 중 하나는 무조건 import가 아닌 패키지 경로로 적어줘야함 (import 시에 그 클래스로만 인식됨)
        */
        Member member1 = new Member();
        basic.pack.Member member2 = new basic.pack.Member();



    }
}
