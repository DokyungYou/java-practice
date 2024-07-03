package mid1.enumeration.example03;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 enum 반환
        Grade[] grades = Grade.values();
        System.out.println("grades: " + Arrays.toString(grades));

        for (Grade grade : grades) {
            System.out.println("name: " + grade.name() + ", ordinal: " + grade.ordinal() ); // ordinal 사용 지양 (상수선언 위치 변경 시 전체의 값이 바뀜)
        }

        
        // String -> Enum 변환 (잘못된 문자열 입력시 IllegalArgumentException )
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold: " + gold);

//        String wrongInput = "gold";
//        Grade wrongGold = Grade.valueOf(wrongInput);
//        System.out.println("gold: " + wrongGold);
    }
}
