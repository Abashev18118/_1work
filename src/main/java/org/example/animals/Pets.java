package org.example.animals;

import java.io.Console;

public abstract class Pets extends Animals{
    public String voice;


    Pets(String name, int age,int  MaxSwimDistance,int MaxRunDistance,String voice){
        super(name, age, MaxSwimDistance, MaxRunDistance);
        this.voice=voice;
    }
    public void getVoice(){
        System.out.println("Голос " +  this.name + ": " + this.voice );

    }

}
