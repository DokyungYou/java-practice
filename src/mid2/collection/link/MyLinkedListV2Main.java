package mid2.collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        System.out.println("\n== 마지막에 추가 - O(n) ==");
        list.add("B");
        list.add("O");
        list.add("B");
        System.out.println(list);

        System.out.println("\n== 첫번째 항목 추가&삭제 - O(1) ==");
        list.add(0, "B"); // O(1)
        System.out.println(list);

        list.remove(0);
        System.out.println(list);  // O(1)

        System.out.println("\n== 중간항목 추가&삭제 - O(n) ==");
        list.add(1,"O");  // O(n)
        System.out.println(list);

        list.remove(1);  // O(n)
        System.out.println(list);
    }
}
