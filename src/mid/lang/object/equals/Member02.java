package mid.lang.object.equals;

import java.util.Objects;

public class Member02 {

    private String id;

    public Member02(String id) {
        this.id = id;
    }

    // 직접 오버라이딩했던 equals
//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Member02){
//            return id.equals(((Member02)obj).id);
//        }else {
//            return false;
//        }
//    }


    // ctrl + insert -> equals() and hashcode()
    // 실무에선 대부분 IDE 가 오버라이딩해준 equals()를 사용
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 같은 객체면 true 리턴
        if (o == null || getClass() != o.getClass()) return false; // null 이거나 클래스타입이 같지 않다면 false 리턴
        
        // 여기까지 내려온 시점에선 클래스가 같은 객체니까 안전하게 다운캐스팅 가능
        Member02 member02 = (Member02) o;
        return Objects.equals(id, member02.id); // id == member02.id
    }


    // 이부분은 나중에 컬렉션프레임워크 할 때
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
