package basic.polymorphism.example2.beforepoly;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차를 구매해서 운전한다.
        driver.setGenesisCar(new GenesisCar());
        driver.testDrive();
        
        // 두번째 새로운 차를 구매해서 운전한다.
        driver.setGenesisCar(null);  // 제거해야 testDrive() 의 분기처리 가능
        driver.setAvanteCar(new AvanteCar());
        driver.testDrive();
    }
}
