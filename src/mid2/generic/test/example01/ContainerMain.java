package mid2.generic.test.example01;

public class ContainerMain {
    public static void main(String[] args) {
        Container<String> strContainer = new Container<>();
        strContainer.setValue("컨테이너");
        if(!strContainer.isNull()) System.out.println(strContainer.getValue());

        Container<Long> longContainer = new Container<>();
        longContainer.setValue(Long.MAX_VALUE);
        if(!longContainer.isNull()) System.out.println(longContainer.getValue());

        Container<Double> doubleContainer = new Container<>();
        //doubleContainer.setValue(7.0);
        if(!doubleContainer.isNull()) System.out.println(doubleContainer.getValue());

    }
}
