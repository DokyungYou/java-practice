package mid1.enumeration.test;

// AuthGrade 의 데이터 출력
public class AuthGradeMain {
    public static void main(String[] args) {
     
        for (AuthGrade authGrade : AuthGrade.values()) {
            System.out.println(
                    "등급: " + authGrade.name() +", " +
                    "레벨: " + authGrade.getLevel() +", " +
                    "설명: " + authGrade.getDescription());
        }

    }
}
