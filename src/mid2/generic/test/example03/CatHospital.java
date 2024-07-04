package mid2.generic.test.example03;

import mid2.generic.animal.Cat;

public class CatHospital {
    private Cat cat;
    public void setCat(Cat cat){
        this.cat = cat;
    }

    public void checkup(){
        System.out.println("동물이름: " + cat.getName());
        System.out.println("동물크기: " + cat.getSize());
        cat.sound();
    }

    public Cat bigger(Cat targetCat){
        return cat.getSize() > targetCat.getSize() ? cat : targetCat;
    }

}
