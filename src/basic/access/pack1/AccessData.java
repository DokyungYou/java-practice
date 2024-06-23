package basic.access.pack1;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("publicMethod 호출" + publicField);
    }
    void defaultMethod(){
        System.out.println("defaultMethod 호출" + defaultField);
    }
    private void privateMethod(){
        System.out.println("privateMethod 호출"+ privateField);
    }


    public void innerAccess(){
        System.out.println("innerAccess 호출");

        publicField  = 1;
        defaultField = 1;
        privateField = 1;

        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
