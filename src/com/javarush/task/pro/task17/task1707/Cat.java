package com.javarush.task.pro.task17.task1707;

public class Cat extends Pet {
    public static final String CAT = "Я не люблю людей.";

    //напишите тут ваш код

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Я не люблю людей.");
    }
}
