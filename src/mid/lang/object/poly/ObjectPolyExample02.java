package mid.lang.object.poly;

public class ObjectPolyExample02 {
    public static void main(String[] args) {

        Car car = new Car();
        Cat cat = new Cat();
        Object obj = new Object();
        String str = "문자열";

        Object[] objects = {car, cat, obj, str};

        getSize(objects);
    }

    private static void getSize(Object[] objects) {
        System.out.println("object 객체의 수: "+ objects.length);
    }
}
