package mid.lang.wrapper.primitive;

public class PrimitiveMethodMain {
    public static void main(String[] args) {
        // 기본형의 한계
        int value = 10;

        //  계속 value 가 사용된다. (객체일 경우 객체 스스로 자기 자신값과 다른 값을 비교하는 메서드로 만드는것이 더 유용)
        int result1 = compareTo(value, 20);
        int result2 = compareTo(value, 0);
        int result3 = compareTo(value, 10);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    static int compareTo(int value, int target){
        if(value < target){
            return -1;
        }else if(value > target){
            return 1;
        }else {
            return 0;
        }
    }
}
