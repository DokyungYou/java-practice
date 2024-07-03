package mid1.lang.object.equals;

public class EqualsMain01 {
    public static void main(String[] args) {
        Member01 member1 = new Member01("id-001");
        Member01 member2 = new Member01("id-001");

        System.out.println("identity: " + (member1 == member2));  // 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
        System.out.println("equality: " + (member1.equals(member2))); // false

        //  public boolean equals(Object obj){ return (this == obj);}
        // Object 에서 제공하는 equals 내부에서 == 연산을 하기때문에 결국은 == 와 동일
    }
}
