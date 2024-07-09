package mid2.collection.set.member;

import java.util.Objects;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    // 해시 자료구조에 해당 데이터를 저장할 경우 반드시 equals(), hashCode() 재정의 필요
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() { // 오버라이딩 전엔 참조값 기반으로 해시코드 생성
        return Objects.hash(id); // id 값을 기반으로 해시코드 생성
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
