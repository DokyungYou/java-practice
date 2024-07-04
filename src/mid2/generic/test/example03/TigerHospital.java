package mid2.generic.test.example03;

import mid2.generic.animal.Tiger;

public class TigerHospital {
    private Tiger tiger;
    public void setTiger(Tiger cat){
        this.tiger = cat;
    }

    public void checkup(){
        System.out.println("동물이름: " + tiger.getName());
        System.out.println("동물크기: " + tiger.getSize());
        tiger.sound();
    }

    public Tiger bigger(Tiger targetTiger){
        return tiger.getSize() > targetTiger.getSize() ? tiger : targetTiger;
    }

}
