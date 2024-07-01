package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            //System.out.println(availableZoneId);// 확인용
            
            // zoneId 이름 기반 (String)
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules() );
        }

        // 현재 내 운영체제 기반
        ZoneId zoneIdBySystem = ZoneId.systemDefault();
        System.out.println("zoneIdBySystem: "+ zoneIdBySystem);  // Asia/Seoul

        // zoneId 이름 기반 (String)
        ZoneId SeoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("SeoulZoneId: " + SeoulZoneId);

    }
}
