package mid2.generic.test.example05;

public class EraserBox<T> {

    // 컴파일 후 실행시점에서는 이레이저에의해 제네릭 정보가 사라지고
    // T가 모두 Object로 변환 (상한 제한했다면 상한타입으로 변환)
    // 자바는 아래와 같은 상황을 허용하지 않는다.
    public boolean  instanceCheck(Object param){
        //return  param instanceof T;  // -> object instanceof Object ...? -> 항상 true
        return false;
    }

    public T creat(Object param){
       //return new T(); // -> new Object()
        return null;
    }
}
