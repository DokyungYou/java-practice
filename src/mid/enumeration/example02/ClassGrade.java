package mid.enumeration.example02;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 외부에서 객체를 생성할 수 없도록 하여 위의 상수만 사용할 수 있도록한다.
    private ClassGrade(){

    }
}
