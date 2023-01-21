package com.example;

/**
 * Задача 2. Есть два самодельных класса коллекций:
 * 
 * ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах не
 * меняется. Методы:
 * • getSize ()
 * • get (int i)
 * 
 * MutableList<T> — коллекция, которая допускает изменения. Методы:
 * • getSize ()
 * • get (int i)
 * • set (int i, T newValue)
 * • add (T newValue)
 * • remove (T value)
 * 
 * Реализуйте такую схему наследования между двумя этими классами, которая будет
 * соответствовать принципу подстановки Лисков.
 *
 */
public class Main {
    public static void main(String[] args) {
        MutableList<Integer> newArray = new MutableList<>(new Integer[] { 1, 2, 3, 4 });
        ImmutableList<Integer> twoArray = new ImmutableList<>(new Integer[] { 1, 2, 3, 4 });
        // test
        newArray.set(1, 1);
        System.out.println(newArray);
        newArray.set(2, 24);
        System.out.println(newArray);
        newArray.remove(2);
        System.out.println(newArray);
        newArray.add(3);
        System.out.println(newArray);
        newArray.add(300);
        System.out.println(newArray);

        System.out.println(newArray.getSize());
        System.out.println(twoArray.getSize());
        System.out.println(newArray.get(1));
        System.out.println(twoArray.get(1));

    }
}
