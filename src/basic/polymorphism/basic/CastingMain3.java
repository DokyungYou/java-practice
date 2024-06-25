package basic.polymorphism.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        castChild(parent1);
        castChild(parent2);


        System.out.println("new Parent() instanceof Parent :" + (new Parent() instanceof Parent));
        System.out.println("new Child() instanceof Parent :" + (new Child() instanceof Parent));
        System.out.println("new Parent() instanceof Child :" + (new Parent() instanceof Child));
        System.out.println("new Child() instanceof Child :" + (new Child() instanceof Child));


    }

    private static void castChild(Parent parent){

        // Child 인스턴스인 경우 
        if(parent instanceof Child){ // java16에서는 instanceof 동시에 변수선언 가능  parent instanceof Child child
            System.out.println("Child 인스턴스로 캐스팅 가능");
            Child child = (Child) parent;
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스 캐스팅 불가");
        }
    }
}
