package basic.static1;

public class DataCountMain {
    public static void main(String[] args) {
        System.out.println("==== Data1 ====");

        Data1 firstData1 = new Data1("first Data1");
        System.out.println("data1.count: " + firstData1.getCount());

        Data1 secondData1 = new Data1("second Data1");
        System.out.println("data1.count: " + secondData1.getCount());

    }
}
