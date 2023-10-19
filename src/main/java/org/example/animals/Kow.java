package org.example.animals;

public class Kow extends Pets{
    private static int petscount;

    private static int count3;
    public Kow(String name, int age,int  MaxSwimDistance,int MaxRunDistance, String voice){
        super(name, age,  MaxSwimDistance, MaxRunDistance,voice);
        count3++;
        petscount++;
    }
    public static int getCount(){return count3;};
    public static int getPetscount(){return petscount;}




}
