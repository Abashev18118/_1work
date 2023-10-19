package org.example.animals;

public class Dog extends Pets{
    private static int petscount4;

    private static int count1;
    public Dog(String name, int age, int MaxSwimDistance, int MaxRunDistance, String voice) {
        super(name, age, MaxSwimDistance, MaxRunDistance, voice);
        count1++;
        petscount4++;
    }
    public static int getCount(){return count1;};
    public static int getPetscount(){return petscount4;}
}
