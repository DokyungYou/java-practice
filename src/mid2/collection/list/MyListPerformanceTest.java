package mid2.collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50000;

        System.out.println("\n== MyArrayList ==");
        addFirst(new MyArrayList<>(), size); // 1444ms
        addMid(new MyArrayList<>(), size); // 669ms  조회 O(1) , 추가(데이터밀기) O(n)
        addLast(new MyArrayList<>(), size); // 1ms 조회 O(1), 추가 O(1)


        int loop = 10000;
        System.out.println("\n== MyArrayList 조회 ==");
        MyArrayList<Integer> myArrayList = new MyArrayList<>(); // 조회용 데이터
        addLast(myArrayList, size);  // 1ms
        getIndex(myArrayList, loop, 0); // 1ms
        getIndex(myArrayList, loop, size/2); // 0ms
        getIndex(myArrayList, loop, size-1); // 0ms

        System.out.println("\n== MyArrayList 검색 ==");
        search(myArrayList, loop, 0); // 1ms
        search(myArrayList, loop, size/2); // 125ms
        search(myArrayList, loop, size-1); // 236ms

        // ==========================================================================

        System.out.println("\n== MyLinkedList ==");
        addFirst(new MyLinkedList<>(), size); // 2ms
        addMid(new MyLinkedList<>(), size);  // 1524ms  조회 O(n) , 추가(노드 연결) O(1)
        addLast(new MyLinkedList<>(), size); // 2103ms 조회 O(n), 추가(노드 연결) O(1)


        System.out.println("\n== MyLinkedList 조회==");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();  // 조회용 데이터
        addLast(myLinkedList, size); // 1866ms
        getIndex(myLinkedList, loop, 0); //0ms
        getIndex(myLinkedList, loop, size/2); // 308ms
        getIndex(myLinkedList, loop, size-1); // 766ms

        System.out.println("\n== MyLinkedList 검색 ==");
        search(myLinkedList, loop, 0); // 0ms
        search(myLinkedList, loop, size/2); // 693ms
        search(myLinkedList, loop, size-1); // 1326ms


        /*
         이론상으로 검색, addMid() 의 경우 MyArrayList 와 MyLinkedList 의 성능이 비슷해야하나 MyArrayList 이 더 빠른이유

         arrayList: 메모리에서도 연속적으로 위치 VS linkedList: 개별의 객체로 존재
         -> arrayList 의 메모리 접근 속도가 더 빠름
         -> CPU 캐시 효율 좋음

         데이터를 앞쪽 위치에서 추가&삭제 빈번하게 일어나는 경우가 아닐 경우
         웬만하면 arrayList 추천
        */
    }
    private static void addFirst(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addFirst() - size: " + size +", 소요시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i); // 데이터 추가될때마다의 중간
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addMid() - size: " + size +", 소요시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addLast() - size: " + size +", 소요시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: "+ index +", 반복횟수: " + loop + ", 소요시간: " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: "+ findValue +", 반복횟수: " + loop + ", 소요시간: " + (endTime - startTime) + "ms");
    }
}
