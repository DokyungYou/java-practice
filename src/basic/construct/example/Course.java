package basic.construct.example;

// 클래스의 생성자 코드에 중복이 없도록 주의

import java.util.ArrayList;

// 생성조건)
// 기본생성자
// title, director 매개변수만 받는 생성자
// 모든 필드를 매개변수로 받는 생성자
public class Course {

    String title;
    String professor;
    int capacity;



    // 다른 생성자에서 this()를 호출한다고 객체가 두개가 만들어지는 것이 아님
    // new:  객체 생성 및 heap 메모리에 넣는 역할
    // 생성자: 초기화 로직 수행
    Course(){
        this("미정", "미정", -1);
    }
    Course(String title , String professor){
        this(title, professor, -1);
    }


    Course(String title , String professor, int capacity){
        this.title = title;
        this.professor = professor;
        this.capacity = capacity;
    }



    public void showInfo(){
        showTitle();
        showProfessor();
        showCapacity();
        System.out.println();
    }



    public void showTitle(){
        System.out.println("강의제목: " + title);
    }
    private void showProfessor() {
        System.out.println("담당교수: "+ professor);
    }

    private void showCapacity() {
        System.out.println("정원: " + capacity + "명");
    }


    public static void main(String[] args) {

        Course course1 = new Course();
        Course course2 = new Course("Java의 기초","김자반");
        Course course3 = new Course("Java의 기초","김자반", 30);

        course1.showInfo();
        course2.showInfo();
        course3.showInfo();


    }
}
