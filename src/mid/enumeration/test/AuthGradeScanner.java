package mid.enumeration.test;


import java.util.Scanner;
import static mid.enumeration.test.AuthGrade.*;

// 인증 등급 열거형 활용
public class AuthGradeScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("당신의 등급을 입력하시오. [GUEST, LOGIN, ADMIN] ");
            String gradeStr = scanner.nextLine();

            try{
                printScreen(valueOf(gradeStr.toUpperCase()));
                break;
            }catch(IllegalArgumentException e){
                System.out.println(gradeStr + ": 존재하지 않는 등급입니다.");
            }
        }

        scanner.close();
    }

    private static void printScreen(AuthGrade grade){
        int level = grade.getLevel();

        if(level >= GUEST.getLevel()) System.out.println("- 메인화면");
        if(level >= LOGIN.getLevel()) System.out.println("- 이메일 관리 화면");
        if(level >= ADMIN.getLevel()) System.out.println("- 관리자 화면");
    }
}
