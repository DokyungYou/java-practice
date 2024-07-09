package mid2.collection.set.test;

import java.util.HashSet;

public class RectangleMain {
    public static void main(String[] args) {
        HashSet<Rectangle> set = new HashSet<>();
        set.add(new Rectangle(30, 30));
        set.add(new Rectangle(20, 30));
        set.add(new Rectangle(40, 70));
        set.add(new Rectangle(20, 30));

        for (Rectangle rectangle : set) {
            System.out.println(rectangle);
        }
    }
}
