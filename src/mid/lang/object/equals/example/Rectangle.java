package mid.lang.object.equals.example;

import java.util.Objects;

// 넓이와 높이가 모두 같다면 동등성 비교에 성공하게 하라
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }


    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
