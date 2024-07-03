package mid1.lang.object.tostring;

public class Cat {
    private String catName;
    private int age;

    public Cat(String catName, int age){
        this.catName = catName;
        this.age = age;
    }


    // 바로 overriding(crtl + o)으로 들어가지 말고  alt + insert  -> toString() 으로 들어가면 편하다.
    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                '}';
    }
}
