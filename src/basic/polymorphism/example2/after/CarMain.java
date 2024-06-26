package basic.polymorphism.example2.after;
public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setCar(new Genesis());
        driver.testDrive();

        driver.setCar(new Avante());
        driver.testDrive();

    }
}
