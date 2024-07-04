package mid2.generic.example03;

import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        catHospital.setAnimal(new Cat("고앵이", 100));
        Cat biggerCat = catHospital.bigger(new Cat("괭이", 200));
        System.out.println(biggerCat + "가 더 크다.");

        //catHospital.setAnimal(new Tiger("호랑이", 1000));


        AnimalHospitalV3<Tiger> tigerHospital = new AnimalHospitalV3<>();
        tigerHospital.setAnimal(new Tiger("호냥이", 400));
        Tiger biggerTiger = tigerHospital.bigger(new Tiger("호랭이", 600));
        System.out.println(biggerTiger + "가 더 크다.");

    }
}
