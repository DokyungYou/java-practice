package time.local;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(11, 29, 30);

        System.out.println("현재시간: " + nowTime);
        System.out.println("지정시간: " + ofTime);

        //계산(불변)
        LocalTime ofTimePlusSecond = ofTime.plusSeconds(40);
        System.out.println("지정시간 + plusSecond: " + ofTimePlusSecond);
    }
}
