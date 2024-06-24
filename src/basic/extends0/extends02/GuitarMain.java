package basic.extends0.extends02;

public class GuitarMain {
    public static void main(String[] args) {
        
        // 부모클래스로부터 상속받은 메서드 호출
        AcousticGuitar acousticGuitar = new AcousticGuitar();
        acousticGuitar.tune();
        acousticGuitar.play();

        ElectricGuitar electricGuitar = new ElectricGuitar();
        acousticGuitar.tune();
        electricGuitar.play();
    }
}
