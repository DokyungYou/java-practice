package mid2.collection.deque.test.queue;

public class TaskSchedulerMain {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new CleanTask());
        scheduler.addTask(new CompressionTask());

        scheduler.getRemainingTask();

        scheduler.run();
    }
}
