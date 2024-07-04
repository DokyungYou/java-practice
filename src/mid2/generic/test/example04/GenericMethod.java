package mid2.generic.test.example04;

public class GenericMethod {
    public static Object objMethod(Object object){
        System.out.println("Object print: " + object);
        return object;
    }

    // 제네릭 메서드 (제네릭 타입과는 다름)
    // <>를 반환타입 앞에 붙여줘야함
    // 호출하는 시점에 타입이 정해진다.
    public static<T> T genericObjMethod(T t){
        System.out.println("Object print: " + t);
        return t;
    }

    public static<T extends Number> T numberMethod(T t){
        System.out.println("number print: " + t);
        return t;
    }

}
