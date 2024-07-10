package mid2.collection.deque.test.queue;

import mid2.collection.deque.test.Work;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueue {
    private Queue<Work> printerQueue = new ArrayDeque<>();


    public void addWork(Work work){
        printerQueue.offer(work);
    }

    public void print(){
        Work printWork = printerQueue.poll();
        if(printWork == null){
            System.out.println("출력할 내역이 없습니다.");
            return;
        }
        System.out.println("출력: " + printWork);
    }

    public void showWorks(){
        System.out.print("대기 중인 출력내역: ");
        System.out.println(printerQueue);
    }
}
