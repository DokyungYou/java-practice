package mid2.collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(1);
        System.out.println(list.toString());

        System.out.println("== 데이터 추가 ==");
        list.add("a");
        System.out.println(list.toString());
        list.add("a");
        System.out.println(list.toString());
        list.add("p");
        System.out.println(list.toString());
        list.add("p");
        System.out.println(list.toString());




    }
}
