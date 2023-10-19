package org.example.animals;

public class Goat extends Pets{

    private static int count4;
    private static int petscount1;

    public Goat(String name, int age,int  MaxSwimDistance,int MaxRunDistance, String voice){
        super(name, age,  MaxSwimDistance, MaxRunDistance,voice);
        count4++;
        petscount1++;
    }
    public static int getCount(){return count4;};
    public static int getPetscount(){return petscount1;}

}
