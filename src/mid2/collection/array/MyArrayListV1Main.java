package mid2.collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1(3);
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


        System.out.println("== 기능 사용 ==");
        System.out.println("list.size():  " + list.size());

        System.out.println("list.get(0): " + list.get(0));
        System.out.println("list.get(1): " + list.get(1));
        System.out.println("list.get(2): " + list.get(2));

        System.out.println("list.indexOf(\"a\") = " + list.indexOf("a"));
        System.out.println("\"a\"의 두번째 인덱스 = " + list.indexOf("a", list.indexOf("a") + 1));

        System.out.println("list.set(0,\"A\") = " + list.set(0, "A"));

    }
}
