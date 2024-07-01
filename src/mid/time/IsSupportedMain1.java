package mid.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        
        //  연,월,일만 있는 상태에서 "SECOND_OF_MINUTE" 꺼내기
        LocalDate now = LocalDate.now();
       // int i = now.get(ChronoField.SECOND_OF_MINUTE); // UnsupportedTemporalTypeException: Unsupported field: SecondOfMinute

        // 사용할 수 있는 메서드인지 확인
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        if(supported){
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println(minute);
        }
    }
}
