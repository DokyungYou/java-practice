package basic.ref;

class BigData{
    InitData data;
    int count;

}

public class Null {
    public static void main(String[] args) {

        BigData bigData = new BigData();
        System.out.println("bigData.data = " + bigData.data);  // null
//        System.out.println("bigData.data.num = " + bigData.data.num);  // NullPointerException


        bigData.data = new InitData();
        System.out.println(bigData.data.num);  // 0
    }
}
