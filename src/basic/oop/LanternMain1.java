package basic.oop;


public class LanternMain1 {
    public static void main(String[] args) {

        Lantern lantern = new Lantern();

        lantern.turnOn();

        lantern.upLight();
        lantern.upLight();
        lantern.upLight();

        lantern.showStatus();

        lantern.downLight();
        lantern.showStatus();

        lantern.turnOff();
        lantern.showStatus();
    }
}
