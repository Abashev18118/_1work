package org.example.animals;
public abstract class Animals {
    public int dist;
    public int distSw;
    public String namuch;
    static int count;
    public int age;//Инициализация возраста
    public String name;//Инициализация имени
    public int MaxSwimDistance;//Инициализация максимальной дистанции плавания
    public int MaxRunDistance;//Инициализация максимальной дистанции бега



    public Animals(String name, int age, int MaxSwimDistance, int MaxRunDistance) {//Конструктор с 4 параметрами
        this.name = name;
        this.age = age;
        this.MaxSwimDistance = MaxSwimDistance;
        this.MaxRunDistance = MaxRunDistance;
        count++;
    }
    public void run(int dist){
        if (MaxRunDistance>=dist)
            System.out.println(this.name + " Добежал");
        else
            System.out.println(this.name +" Не добежал");
    }
    public void swim(int distSw){
        if (MaxSwimDistance>=distSw)
            System.out.println(this.name + " Доплыл");
        else
            System.out.println(this.name +" Не доплывет");
    }
    public String getNamuch(){
        return name;
    }
    public  static int getCount(){
        return count;
    }

}
