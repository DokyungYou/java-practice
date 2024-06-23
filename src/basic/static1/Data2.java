package basic.static1;

public class Data2 {

    public String name;

    public Data2(String name, DataCounter counter) {
        this.name = name;
        counter.count++;
    }
}
