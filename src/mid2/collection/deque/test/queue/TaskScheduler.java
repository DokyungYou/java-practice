package mid2.collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> taskQueue = new ArrayDeque<>();

    public void addTask(Task task){
        taskQueue.offer(task);
    }

    public void run(){
        System.out.println("== 작업 시작 ==");
        while (!taskQueue.isEmpty()){
            processNextTask();
            System.out.println("남은 작업 수: " + getRemainingTask() + "\n");
        }
        System.out.println("== 작업 완료 ==");
    }

    private void processNextTask() {
        Task task = taskQueue.poll();
        if(task != null) task.execute();
    }

    public int getRemainingTask(){
        return taskQueue.size();
    }
}
