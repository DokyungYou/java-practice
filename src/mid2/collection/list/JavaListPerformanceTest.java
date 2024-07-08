package mid2.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50000;

        System.out.println("\n== ArrayList ==");
        // 데이터를 한칸 씩 미는 것이 아닌 고속복사로 성능 최적화
        addFirst(new ArrayList<>(), size); // 1444ms -> 84ms
        addMid(new ArrayList<>(), size); // 669ms -> 38ms
        addLast(new ArrayList<>(), size); // 1ms -> 1ms


        int loop = 10000;
        System.out.println("\n== ArrayList 조회 ==");
        ArrayList<Integer> arrayList = new ArrayList<>(); // 조회용 데이터
        addLast(arrayList, size);  // 1ms -> 2ms
        getIndex(arrayList, loop, 0); // 1ms -> 0ms
        getIndex(arrayList, loop, size/2); // 0ms -> 0ms
        getIndex(arrayList, loop, size-1); // 0ms -> 0ms

        System.out.println("\n== ArrayList 검색 ==");
        search(arrayList, loop, 0); // 1ms -> 0ms
        search(arrayList, loop, size/2); // 125ms -> 86ms
        search(arrayList, loop, size-1); // 236ms -> 185ms

        // ==========================================================================

        System.out.println("\n== LinkedList ==");
        // first, end 노드참조 , 양방향 연결방식
        addFirst(new LinkedList<>(), size); // 2ms -> 2ms
        addMid(new LinkedList<>(), size);  // 1524ms -> 877ms
        addLast(new LinkedList<>(), size); // 2103ms -> 2ms


        System.out.println("\n== LinkedList 조회==");
        LinkedList<Integer> linkedList = new LinkedList<>();  // 조회용 데이터
        addLast(linkedList, size); // 1866ms -> 1ms
        getIndex(linkedList, loop, 0); // 0ms -> 0ms
        getIndex(linkedList, loop, size/2); // 308ms -> 307ms
        getIndex(linkedList, loop, size-1); // 766ms -> 0ms

        System.out.println("\n== LinkedList 검색 ==");
        search(linkedList, loop, 0); // 0ms -> 0ms
        search(linkedList, loop, size/2); // 693ms -> 448ms
        search(linkedList, loop, size-1); // 1326ms -> 873ms

    }
    private static void addFirst(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addFirst() - size: " + size +", 소요시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i); // 데이터 추가될때마다의 중간
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addMid() - size: " + size +", 소요시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addLast() - size: " + size +", 소요시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: "+ index +", 반복횟수: " + loop + ", 소요시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: "+ findValue +", 반복횟수: " + loop + ", 소요시간: " + (endTime - startTime) + "ms");
    }
}
