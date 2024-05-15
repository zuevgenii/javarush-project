package com.javarush.task.task14.task1421;

/* 
Singleton
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Solution {
    public interface Walkable{
        void walk();
    }
    public abstract class Gt{

    }
    final interface a{

    }
    public static class Animal implements Walkable{

        @Override
        public void walk() {
            System.out.println("walks");
        }
    }
    public static class Human extends Animal{
        public void walk() {
            System.out.println("walks on 2 feet");
        }
       final public void talk() {
            System.out.println("talks");
        }
    }
    public static void main(String... args) {
        char[] chars = {'a','b'};
        ArrayList<String> arrayList = new ArrayList<>();

     //   System.out.println(arrayList instanceof List);
        Walkable a = new Human();
        Animal b = new Human();
        Walkable c = new Animal();
        Human d = new Human();
       // d.talk();
       /* int i =3;
        i = i--;
        System.out.println(i);
        --i;
        System.out.println(i);
        System.out.println(i++);*/
        String first = "Hello";
        String second = new String(first);
        System.out.println(first.equals(second));
        Ф
    }
}
