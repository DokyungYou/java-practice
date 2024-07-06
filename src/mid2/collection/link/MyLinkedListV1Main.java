package mid2.collection.link;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
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
        System.out.println("list.set(0,\"A\") = " + list.set(0, "A"));

        System.out.println(list);

    }
}
