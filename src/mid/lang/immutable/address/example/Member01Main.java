package mid.lang.immutable.address.example;

import mid.lang.immutable.address.Address;

public class Member01Main {
    public static void main(String[] args) {
        Address address1 = new Address("서울");

        // 주소가 서울인 회원이 두명이고, 메모리 효율을 위해 같은 주소 객체로 값을 할당해주었다.
        Member01 member01 = new Member01("가나다",address1);
        Member01 member02 = new Member01("마바사",address1);
        
        //  두 회원의 첫 주소는 서울
        System.out.println("member1: " + member01);
        System.out.println("member2:  " + member02);

        // 회원2만 인천으로 이사를 했다.
        member02.getAddress().setValue("인천");

        // 회원1도 강제 이사당해버렸다... (address 공유참조로 인한 사이드이펙트발생)
        System.out.println("member1: " + member01);
        System.out.println("member2:  " + member02);

    }
}
