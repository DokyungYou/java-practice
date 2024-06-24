package basic.extends0.super02.example;

import java.util.Arrays;

public class Movie extends Item{
    private String director;
    private String[] actors;

    public Movie(String name, int price, String director, String[] actors){

        super(name, price);
        this.director = director;
        this.actors = actors;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("감독: " + director + " 배우: " + Arrays.toString(actors));
    }
}
