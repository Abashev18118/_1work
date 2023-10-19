package org.example.animals;

public class Humster extends Pets{
    private static int petscount2;

    private static int count5;
    public Humster(String name, int age,int  MaxSwimDistance,int MaxRunDistance, String voice){
        super(name, age,  MaxSwimDistance, MaxRunDistance,voice);
        count5++;
        petscount2++;
    }
    public static int getCount(){return count5;};
    public static int getPetscount(){return petscount2;}

}
