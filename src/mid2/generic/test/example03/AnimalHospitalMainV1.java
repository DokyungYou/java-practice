package mid2.generic.test.example03;

import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();
        catHospital.setAnimal(new Cat("고영희", 100));
        catHospital.setAnimal(new Tiger("호냥이", 1000)); // 의도는 Cat만 들어가야하지만 Tiger도 허용됨
        catHospital.checkup();


        // 의도는 Cat만 들어가야하지만 Tiger도 허용됨
        // 반환타입 Cat이 아닌 Animal (다운캐스팅 필요) -> Tiger이 더 큼 -> Tiger타입 반환 -> 캐스팅예외발생
        Cat bigger = (Cat)(catHospital.bigger(new Cat("메인쿤", 500)));
        //Cat bigger2 = (Cat)(catHospital.bigger(new Tiger("호냥이", 1000)));
        System.out.println("더 큰 고양이: " + bigger);

    }
}
