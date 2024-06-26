package basic.construct;

public class StudentConstruct {

    String name;
    int age;
    int grade;

    public StudentConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = -1;


        // StudentConstruct(String name, int age, int grade) 를 호출함
        // this()는 생성자 실행문의 첫줄에만 작성 가능
        this(name, age, -1);
    }

    public StudentConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void showInfo(){
        System.out.println("이름: " + name + ", 나이: " + age + ", 성적: "+ grade);
    }



    public static void main(String[] args) {
        StudentConstruct student1 = new StudentConstruct("학생1", 19, 100);
        StudentConstruct student2 = new StudentConstruct("학생1", 19);

        student1.showInfo();
        student2.showInfo();
    }
}
