package mid2.collection.deque.test.stack;

import mid2.collection.deque.test.Work;

public class DrawingWorkHistoryMain {
    public static void main(String[] args) {
        DrawingWorkHistory history = new DrawingWorkHistory();
        history.addWork(new Work("선긋기1"));
        history.addWork(new Work("선긋기2"));
        history.addWork(new Work("선긋기3"));
        history.addWork(new Work("선긋기4"));
        history.addWork(new Work("지우기5"));
        history.addWork(new Work("채우기6"));
        history.addWork(new Work("채우기7"));
        history.addWork(new Work("레이어추가1"));
        System.out.println("현재작업: " + history.getCurrentWork());
        history.showHistory();

        history.goBack();
        history.goBack();
        history.goBack();
        System.out.println("뒤로 가기 3번");
        System.out.println("currentWork: " + history.getCurrentWork());

        history.goBack();
        history.goBack();
        history.goBack();
        System.out.println("뒤로 가기 3번");
        System.out.println("currentWork: " + history.getCurrentWork());

        history.showHistory();

        history.goBack();
        System.out.println("currentWork: " + history.getCurrentWork());

        history.goBack();
        System.out.println("currentWork: " + history.getCurrentWork());

        history.goBack();
        history.goBack();

    }
}
