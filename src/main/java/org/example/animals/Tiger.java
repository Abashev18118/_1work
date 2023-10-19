package org.example.animals;
import org.example.animals.Animals;
public class Tiger extends Animals{
    private static int count2;
    public Tiger(String name, int age, int MaxSwimDistance, int MaxRunDistance) {
        super(name, age, MaxSwimDistance, MaxRunDistance);
        count2++;
    }
    public static int getCount(){return count2;};
}
