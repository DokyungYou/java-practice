package basic.extends0.extends01;

public class GuitarMain {
    public static void main(String[] args) {
        AcousticGuitar acousticGuitar = new AcousticGuitar();
        acousticGuitar.play();
        acousticGuitar.tune();
        acousticGuitar.play();


        ElectricGuitar electricGuitar = new ElectricGuitar();
        electricGuitar.tune();
        electricGuitar.connectToAmp();
        electricGuitar.play();



    }
}
