package mid2.collection.list;

public class BatchProcessor {


    //private final MyArrayList<Integer> list = new MyArrayList<>();
    /*
    -> arrayList 클래스에 직접 의존했던 상태이나 logic 메서드 내의 로직을 실행하기에 성능이 좋지못함.
    -> LinkedList 변경 고려
    -> 필드의 타입과 생성자 코드를 직접 변경해야함 (OCP 원칙 위배)
    -> 클래스 내에서는 추상화해놓고, 어떤 구현체를 선택할지는 생성자를 통해 결정한다. (의존관계를 클래스 정의시점이 아닌 런타임시점으로 미루기)
    */


    private final MyList<Integer> list;

    // list 의 구현체는 런타임 시점에 생성자를 통해 결정 (의존관계가 내부가 아닌 외부에서 결정 뒤 주입되는 모양새 => "의존관계 주입 , Dependency Injection" 이라 표현)
    public BatchProcessor(MyList<Integer> list){   // 생성자 의존관계주입
        this.list = list;
    };

    public void logic(int size){   // 복잡한 로직이라 가정 (list 앞 부분에 데이터 추가 반복)
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { // 반복문 전체 도는데 O(n)
            list.add(0,i); // 데이터 하나 추가할때마다 데이터 이동때문에 O(n)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("size: " + size + " ,time: " + (endTime - startTime) + "ms");
    }
}
