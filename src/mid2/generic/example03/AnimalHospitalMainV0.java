package mid2.generic.example03;

import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        CatHospital animalHospital = new CatHospital();
        animalHospital.setCat(new Cat("고영희", 100));
        animalHospital.checkup();
        Cat biggerCat = animalHospital.bigger(new Cat("메인쿤", 500));
        System.out.println("더 큰 고양이: " + biggerCat);

        TigerHospital tigerHospital = new TigerHospital();
        tigerHospital.setTiger(new Tiger("범", 1000));
        tigerHospital.checkup();
        Tiger biggerTiger = tigerHospital.bigger(new Tiger("호랭이", 1500));
        System.out.println("더 큰 호냥이: " + biggerTiger);
    }
}
