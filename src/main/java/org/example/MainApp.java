package org.example;

import org.example.animals.*;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String voice;
        int distSw;
        int dist;

        Animals[] pets =
                {
                        new Tiger("Танчик",5,0,550),
                        new Cat("Мурзик", 3, 0, 180, "Мяу"),
                        new Cat("Барсик", 2, 0, 151, "Мяяяяууу"),
                        new Dog("Пушок", 5, 9, 345, "Гав Гав"),
                        new Kow("Буренка", 10, 0, 100, "Муууу"),
                        new Goat("Зеленый слоник", 5, 3, 120, "Бееее"),
                        new Humster("Танчик", 1, 0, 2, "Пииииии"),
                        new Parrot("Кеша", 1, 0, 1, "Чичичи")


                };


        for (Animals a : pets) {
            System.out.println("Бег");
            a.run(dist = 150);
            System.out.println("Плавание");
            a.swim(distSw = 8);
        }

        System.out.println("колличество котов " + Cat.getCount());
        System.out.println("Количество собак " + Dog.getCount());
        System.out.println("Количество тигров " + Tiger.getCount());
        System.out.println("Количество коров " + Kow.getCount());
        System.out.println("Количество козлов " + Goat.getCount());
        System.out.println("Количество хомяков " + Humster.getCount());
        System.out.println("Количество попугаев " + Parrot.getCount());
        ((Pets) pets[0]).getVoice();
        ((Pets) pets[1]).getVoice();
        ((Pets) pets[2]).getVoice();
        ((Pets) pets[3]).getVoice();
        ((Pets) pets[4]).getVoice();
        ((Pets) pets[5]).getVoice();
        ((Pets) pets[6]).getVoice();

        System.out.print("Количество домашних животных: ");
        System.out.println(Kow.getPetscount() + Goat.getPetscount() + Humster.getPetscount() + Cat.getPetscount() + Dog.getPetscount() + Parrot.getPetscount());
        System.out.print("Всего создано животных: " + Animals.getCount());


    }
}