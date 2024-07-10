package mid2.collection.deque.test.stack;

import mid2.collection.deque.test.Work;

import java.util.ArrayDeque;
import java.util.Deque;

public class DrawingWorkHistory {
    private Deque<Work> history = new ArrayDeque<>();
    private Work currentWork = null;

    public void addWork(Work workUnit){
        if(currentWork != null){  // 최근작업이 있다면 history 에 먼저 넣고 갱신 
            history.push(currentWork);
        }
        currentWork = workUnit;
    }

    public Work goBack(){ // ctrl + z
        if(history.isEmpty()){
            System.out.println("내역이 존재하지 않습니다.");
            return null;
        }
       return currentWork = history.pop();
    }

    public Work getCurrentWork() {
        return currentWork;
    }

    public void showHistory(){
        System.out.println("== 이전 작업내역 ==");
        ArrayDeque<Work> works = new ArrayDeque<>(history);
        while (works.size() > 0){
            System.out.println(works.pop());
        }
        System.out.println();
    }

}
