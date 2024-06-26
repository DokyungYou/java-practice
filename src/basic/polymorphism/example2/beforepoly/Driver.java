package basic.polymorphism.example2.beforepoly;

public class Driver {
    // 새로운 차 클래스가 생길때마다 속성, 메서드를 추가, 수정을 반복해야한다.. (역할과 구현을 분리하지 않았기에 생기는 문제)
    private GenesisCar genesisCar;

    private AvanteCar avanteCar;

    
    public void setGenesisCar(GenesisCar car){
        this.genesisCar = car;
    }



    public void setAvanteCar(AvanteCar car){
        this.avanteCar = car;
    }


    // 새로운 차 속성이 생길때마다 공용메서드에 조건문이 늘어나야한다
    public void testDrive(){
        System.out.println("자동차를 시운전합니다.");

         if(genesisCar!= null){
             genesisCar.startEngine();
             genesisCar.pressAccelerator();
             genesisCar.offEngine();
         }else if(avanteCar != null){
             avanteCar.startEngine();
             avanteCar.pressAccelerator();
             avanteCar.offEngine();
         }else {
             System.out.println("차를 소유하고 있지 않습니다.");
         }
    }

}
