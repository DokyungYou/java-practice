package mid1.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        // 클래스 조회
        Class<String> stringClass = String.class; // 1. 클래스에서 조회
        Class<? extends String> aClass = new String().getClass(); // 2. 인스턴스에서 조회
        Class<?> aClass1 = Class.forName("java.lang.String");//3. 문자열로 조회


        // 해당 클래스의 모든 필드 출력
        Field[] fields = stringClass.getDeclaredFields();
        for(Field field : fields){
            //System.out.println("field: " + field);
            System.out.println("field: " + field.getType() + " | " + field.getName() );
        }


        // 해당 클래스의 모든 메서드 출력
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println("method: " + method.getReturnType() + " | " + method.getName() );
        }

        // 상위 클래스 정보 출력
        Class<? super String> superclass = stringClass.getSuperclass();
        System.out.println("String 클래스의 부모클래스: " + superclass.getName());
        System.out.println(superclass.getSuperclass()); // Obejct 의 부모클래스 -> null

        // 인터페이스 정보 출력
        Class<?>[] interfaces = stringClass.getInterfaces();
        for(Class<?> clazz : interfaces){
            System.out.println("String 클래스가 구현한 인터페이스: " + clazz.getName());
        }
    }
}
