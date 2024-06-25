package basic.polymorphism.example.after;

// 동물이라는 추상적인 개념이 실제로 존재하는 것은 이상하다.
// Animal 클래스는 다형성을 위해 만든 것이지, 직접 인스턴스를 생성해서 사용할 일이 없음
// 객체 생성방지 + 특정 메서드의 재정의가 필수인 경우 추상메서드를 활용하자. (package basic.polymorphism.example.abstract01 참고)
public class Animal {
    public void sound(){
        System.out.println("동물이 웁니다.");
    }
}
