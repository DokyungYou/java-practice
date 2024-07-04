package mid2.generic.example03;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {

        // Animal과는 관련없는 타입들도 모두 타입인수로 넘겨버릴 수 있는 상황
        AnimalHospitalV2<Cat> hospital1 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Tiger> hospital2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Long> hospital3 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> hospital4 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Animal> hospital5 = new AnimalHospitalV2<>();
    }
}
