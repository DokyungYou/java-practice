package mid1.lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {
    public static void main(String[] args) {

        // 현재시간(밀리초)
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis: " + currentTimeMillis);

        // 현재시간(나노초)
        long currentNanoTime = System.nanoTime();
        System.out.println("currentNanoTime: " + currentNanoTime);


        // 환경 변수 (운영체제 관련)
        Map<String, String> getenv = System.getenv();
        System.out.println("getenv: " + getenv);


        // 시스템 속성 (자바 관련)
        Properties properties = System.getProperties();   // Properties extends Hashtable<Object,Object>
        System.out.println("properties: "+ properties);

        System.out.println("java.version: " + properties.get("java.version"));


        // 배열 고속복사 - 운영체제나 그 밑의 하드웨어 레벨에서 배열을 통째로 복사
        char[] originalArr = {'G','R','E','A','T','J','A','V','A','K','I','M'};

        char[] copiedArr = new char[originalArr.length];
        System.arraycopy(originalArr, 0 ,copiedArr, 0, originalArr.length );
        System.out.println("copiedArr: " + Arrays.toString(copiedArr));


        // 프로그램 종료 (권장 X)
        System.exit(0);
        System.out.println("이미 위에서 종료해서 출력이 안될 코드");
    }
}
