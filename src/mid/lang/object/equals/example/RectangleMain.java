package mid.lang.object.equals.example;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20, 300);
        Rectangle rectangle2 = new Rectangle(20, 300);
        Rectangle rectangle3 = new Rectangle(100, 200);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle2 == rectangle3);
        System.out.println(rectangle1 == rectangle3);


        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle2.equals(rectangle1));

        System.out.println(rectangle1.equals(rectangle3));
        System.out.println(rectangle3.equals(rectangle1));
        System.out.println(rectangle2.equals(rectangle3));
        System.out.println(rectangle3.equals(rectangle2));
    }
}
