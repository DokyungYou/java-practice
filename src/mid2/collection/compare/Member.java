package mid2.collection.compare;

public class Member implements Comparable<Member> {
    private String name;
    private int yearOfBirth;

    public Member(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int compareTo(Member o) { // 자연순서: Comparable 를 통해 구현한 순서
        System.out.println(this + " vs " + o);
        return (this.yearOfBirth < o.yearOfBirth) ? -1 :((this.yearOfBirth == o.yearOfBirth) ? 0 : 1);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + yearOfBirth +
                '}';
    }

}
