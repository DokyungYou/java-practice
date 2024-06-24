package basic.extends0.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod(){
        System.out.println("publicMethod of Parent");
    }
    protected void protectedMethod(){
        System.out.println("protectedMethod of Parent");
    }
    void defaultMethod(){
        System.out.println("defaultMethod of Parent");
    }
    private void privateMethod(){
        System.out.println("privateMethod of Parent");
    }

    public void printParent(){
        System.out.println("== Parent 메서드 안 ==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }

}
