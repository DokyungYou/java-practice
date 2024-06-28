package mid.lang.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class<Hello> helloClass = Hello.class;
//        Class<? extends Hello> aClass = new Hello().getClass();
//        Class<?> aClass1 = Class.forName("mid.lang.clazz.Hello");  // 사용자 입력을 기반으로 객체를 생성하게 할 수 있음

        Hello hello = helloClass.getDeclaredConstructor().newInstance();// hello 클래스가 가진 생성자를 얻어서 객체를 생성
        String methodResult = hello.hello();

        System.out.println(hello);
        System.out.println(methodResult);
    }
}
