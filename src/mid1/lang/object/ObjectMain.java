package mid1.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        
        // Child 본인과 명시적 상속받은 기능 호출 ====================================
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        
        // 묵시적 상속받은 기능 호출 (Object 클래스) ================================
        // 대표 기능 예시
        String str = child.toString(); // 객체정보를 제공
        System.out.println(str);
        
        boolean equals = child.equals(new Child()); // 객체의 같음을 비교
        System.out.println(equals);

        Class<? extends Child> childClass = child.getClass(); // 객체의 클래스 정보를 제공


    }
}
