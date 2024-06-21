package basic.class01.example;

public class CourseMain {
    public static void main(String[] args) {

        Course[] courses = {
                new Course("java basic","자바의 기본"),
                new Course("codingTest of java","자바로 푸는 코딩테스트"),
                new Course("Springboot","스프링부트 입문 강의"),
        };

        for (Course course : courses) {
            System.out.println("강의제목: " + course.title + ", 강의소개: "+ course.summary );
        }

    }
}
