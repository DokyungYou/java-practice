package mid2.generic.animal;

public class Tiger extends Animal{
    public Tiger(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("어흥~~~~");
    }
}
