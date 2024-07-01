package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {
    // 현재위치(국가) 회의 시간  -> 런던, 뉴욕의 회의 시간 구하기
    public static void main(String[] args) {

        // 확인
//        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println(availableZoneId);
//        }
        // Europe/London
        // America/New_York
        
        ZonedDateTime thisPlaceTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
        ZonedDateTime londonTime = thisPlaceTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = thisPlaceTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        String str= thisPlaceTime.getZone().toString();
        System.out.println(str.substring(str.indexOf("/") +1) + " 의 회의시간: " + thisPlaceTime);
        System.out.println("London 의 회의시간: " + londonTime);
        System.out.println("New_York 의 회의시간: " + newYorkTime);

    }
}
