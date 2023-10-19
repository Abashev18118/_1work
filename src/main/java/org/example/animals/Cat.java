package org.example.animals;
public class Cat extends Pets {
    private static int petscount3;
    private static int count;
    public Cat(String name, int age,int  MaxSwimDistance,int MaxRunDistance, String voice) {
        super(name, age, MaxSwimDistance, MaxRunDistance, voice);
        count++;
        petscount3++;
    }
    public static int getCount(){return count;};
    public static int getPetscount(){return petscount3;}
}




