package mid.lang.wrapper.primitive;

public class PrimitiveNullMain {
    public static void main(String[] args) {
        int[] intArray = {3,4,5,2,-3,-1};
        System.out.println(findValue(intArray, 4));
        System.out.println(findValue(intArray, -3));
        System.out.println(findValue(intArray, -10)); // 존재하지 않아서  -1 반환
        System.out.println(findValue(intArray, -1)); // 배열 내에 존재하는 숫자임에도  -1 반환


    }
    private static int findValue(int[] intArray, int target){
        for(int num : intArray) if(target == num) return num;

        return -1;
    }
}
