package mid2.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        // 의존관계 주입
        BatchProcessor batchProcessor1 = new BatchProcessor(new MyArrayList<>());
        BatchProcessor batchProcessor2 = new BatchProcessor(new MyLinkedList<>());

        
        // 성능비교 (데이터 수가 증가할수록 성능차이 up)
        System.out.println("== MyArrayList 주입 =="); // O(n * n)
        batchProcessor1.logic(50_000); // 1454ms
        //batchProcessor1.logic(100_000); // 13124ms
        //batchProcessor1.logic(500_000); // 먹통

        System.out.println("\n== MyLinkedList 주입 =="); //O(1)
        batchProcessor2.logic(50_000);  // 2ms
        batchProcessor2.logic(100_000); // 2ms
        batchProcessor2.logic(500_000); // 142ms
    }
}
