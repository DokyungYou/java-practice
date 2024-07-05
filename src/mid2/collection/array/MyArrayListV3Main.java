package mid2.collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        // 순차적으로 추가(마지막에 추가)  O(1)
        list.add("a");
        list.add("p");
        list.add("p");
        list.add("l");
        list.add("e");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("마지막 위치에 추가"); // O(1)
        list.add(list.size(), "!");
        System.out.println(list);

        System.out.println("첫번째 위치에 추가"); // O(n)
        list.add(0, "!");
        System.out.println(list);

        // 삭제
        System.out.println("마지막 값 삭제");
        list.remove(list.size()-1); // O(1)
        System.out.println(list);

        System.out.println("첫번째 위치 삭제");
        System.out.println(list + " | 삭제된 값: " + list.remove(0)); // O(n)

        System.out.println("그 외 위치 삭제");
        System.out.println(list + " | 삭제된 값: " + list.remove(2)); // O(n)


        /*
        - 데이터 삭제&추가
            - 마지막 위치 : O(1)
            - 앞, 중간: O(n)

        - 조회 (인덱스)
            - O(1)

        - 검색 (순차적 검색)
            - O(n)

        -성능
            앞, 중간의 데이터변경 < 순차적 추가, 순차적 출력
        */
    }
}
