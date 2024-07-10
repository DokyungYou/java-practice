package mid2.collection.deque.test;

public class Work {

    private final String content;

    public Work(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Work{" +
                "content='" + content + '\'' +
                '}';
    }
}
