package basic.access.pack1;


// 클래스의 접근제어자는 public ,default 만 가능
// 하나의 .java 파일에 public 클래스는 단 하나
// default 클래스는 개수제한 X
public class PublicClass {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DefaultClass01 defaultClass01 = new DefaultClass01();
        DefaultClass02 defaultClass02 = new DefaultClass02();
    }
}

class DefaultClass01{

}

class DefaultClass02{

}