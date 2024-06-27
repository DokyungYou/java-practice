package mid.lang.immutable.example;

import mid.lang.immutable.address.ImmutableAddress;

public class Member02Main {
    public static void main(String[] args) {
        ImmutableAddress address1 = new ImmutableAddress("서울");

        // 주소가 서울인 회원이 두명이고, 메모리 효율을 위해 같은 주소 객체로 값을 할당해주었다.
        Member02 member01 = new Member02("가나다",address1);
        Member02 member02 = new Member02("마바사",address1);

        //  두 회원의 첫 주소는 서울
        System.out.println("member1: " + member01);
        System.out.println("member2:  " + member02);

        // 회원2만 인천으로 이사를 했다.
        // member02.getAddress().setValue("인천"); // 주소가 불변객체여서 변경은 불가 

        // 새로운 주소객체를 할당
        member02.setAddress(new ImmutableAddress("인천"));

        // 무사히 회원2만 인천으로 이사성공
        System.out.println("member1: " + member01);
        System.out.println("member2:  " + member02);

    }
}
