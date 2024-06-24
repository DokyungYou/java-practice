package basic.extends0.super01;

public class Child extends Parent{
    public String value = "Child";

    @Override
    public void hello() {
        System.out.println("hello of Child");
    }

    public void call(){
        System.out.println("this value: "+ value);
        System.out.println("super value: "+ super.value);

        hello();
        super.hello();
    }
}
