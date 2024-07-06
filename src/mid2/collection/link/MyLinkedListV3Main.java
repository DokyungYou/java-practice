package mid2.collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        System.out.println("\n== 마지막에 추가 - O(n) ==");
        stringList.add("B");
        stringList.add("O");
        stringList.add("B");
        //list.add(1);
        System.out.println(stringList);

        System.out.println("\n== 첫번째 항목 추가&삭제 - O(1) ==");
        stringList.add(0, "B"); // O(1)
        System.out.println(stringList);

        stringList.remove(0);
        System.out.println(stringList);  // O(1)

        System.out.println("\n== 중간항목 추가&삭제 - O(n) ==");
        stringList.add(1,"O");  // O(n)
        System.out.println(stringList);

        stringList.remove(1);  // O(n)
        System.out.println(stringList);

        // ============================================================
        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        System.out.println(intList);

        System.out.println(intList.get(3));
    }
}
