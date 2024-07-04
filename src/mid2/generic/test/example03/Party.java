package mid2.generic.test.example03;

import mid2.generic.test.example03.unit.ClassUnit;

import java.util.ArrayList;

/*
TODO 2
제네릭 타입 사용
showInfo() 메서드를 통해 파티에 참여한 유닛의 정보 출력
*/
public class Party {
    private final ArrayList<Member<?>> members;
    private int maxNumber;

    public Party(int maxNumber) {
        this.members = new ArrayList<>();
        this.maxNumber = maxNumber;
    }

    public void addMember(Member<? extends ClassUnit> member) {
        if (members.size() >= maxNumber) {
            System.out.println("정원초과");
            return;
        }
        members.add(member);
        System.out.println("파티멤버 추가성공");
    }

    public void changeMaxNumber(int changeNumber) {
        if (members.size() > changeNumber) {
            System.out.println("인원조정 불가: 현재 인원이 조정인원보다 많습니다.");
            return;
        }
        maxNumber = changeNumber;
        System.out.println("정원 조정: " + changeNumber +", 현재인원: " + members.size());
    }

    public void showMembers() {
        for (Member<?> member : members) {
            member.showInfo();
        }
    }

    //제네릭 상한 타입 사용
    static class Member<T extends ClassUnit> {

        private T unit;

        public Member(T unit) {
            this.unit = unit;
        }

        public T getUnit() {
            return unit;
        }

        public void showInfo() {
            System.out.printf("class: %s, HP: %s, MP: %s\n", unit.getName(), unit.getHp(), unit.getMp());
        }
    }
}
