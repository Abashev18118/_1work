package org.example.animals;

public class Parrot extends Pets{

    private static int count5;
    private static int petscount5;



    public Parrot(String name, int age,int  MaxSwimDistance,int MaxRunDistance, String voice){
        super(name, age,  MaxSwimDistance, MaxRunDistance,voice);
        count5++;
        petscount5++;

    }
    public static int getCount(){return count5;};
    public static int getPetscount(){return petscount5;}

}
