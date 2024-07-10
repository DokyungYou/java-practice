package mid2.collection.deque.test.queue;

import mid2.collection.deque.test.Work;

public class PrinterQueueMain {
    public static void main(String[] args) {
        PrinterQueue printer = new PrinterQueue();

        printer.addWork(new Work("작업문서1"));
        printer.addWork(new Work("작업문서2"));
        printer.addWork(new Work("작업문서3"));
        printer.addWork(new Work("작업문서4"));

        printer.showWorks();

        printer.print();
        printer.print();
        printer.print();
        printer.print();
        printer.print();
    }
}
