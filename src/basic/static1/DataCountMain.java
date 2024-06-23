package basic.static1;

public class DataCountMain {
    public static void main(String[] args) {
        System.out.println("==== Data1 ====");

        Data1 firstData1 = new Data1("first Data1");
        System.out.println("data1.count: " + firstData1.getCount());

        Data1 secondData1 = new Data1("second Data1");
        System.out.println("data1.count: " + secondData1.getCount());




        // ========================================================
        System.out.println("==== Data2 ====");

        // 동일한 DataCounter 객체를 넣어서 사용함으로써 Data2의 누적 수를 알 수 있기는 함
        // Counter 라는 별도의 클래스를 추가 사용한다는 점이 매우 별로임 (그저 누적 수 하나만 셀 뿐인데 별도의 클래스를 만든다? 심지어 Data2에만 사용하기위해?)
        // 추가로 카운트 대상인 Data2가 복잡해짐
        DataCounter counter = new DataCounter();
        Data2 firstData2 = new Data2("first Data2", counter);
        System.out.println("counter.count: " + counter.count);


        Data2 secondData2 = new Data2("second Data2", counter);
        System.out.println("counter.count: " + counter.count);


    }
}
