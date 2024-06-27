package mid.lang.string.chaining;

import java.util.ArrayList;

public class MethodChainingMain02 {
    public static void main(String[] args) {

        ValueAdder valueAdder = new ValueAdder();
//        ValueAdder adder1 = valueAdder.add(10);
//        ValueAdder adder2 = valueAdder.add(20);
//        ValueAdder adder3 = valueAdder.add(30);


        // 메서드 체이닝 (메서드 호출의 결과로 자신의 참조값 반환시 메서드 호출을 계속 이어나갈 수 있게됨)
        int result = valueAdder.add(10).add(20).add(30).add(40).getValue();
        System.out.println(result);


        // StringBuilder 의 메서드 체인기법
        StringBuilder sb = new StringBuilder("()=(");
        String sbResult = sb.append(")=(").append(")=(").append(")=(").append(")=(")
                .delete(1,2)
                .insert(0,"@@")
                .reverse()
                .toString();
        System.out.println(sbResult);



//        public StringBuilder append(String str) {
//            super.append(str);
//            return this;
//        }

    }
}
