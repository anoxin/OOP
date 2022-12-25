package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
 * boolean isGood (T item);
 * Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
 * Создайте следующие детские классы:
 * • IsEven — ему дают целое число, он одобряет его, если оно чётное
 * • IsPositive — ему дают целое число, он одобряет его, если оно положительное
 * • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы
 * A
 * • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он
 * проверяет, что она начинается с того, что он запомнил
 * 
 * Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и
 * одобрятель IsGood.
 * Функция возвращает новую коллекцию, куда входят только одобренные элементы из
 * коллекции.
 * Продемонстрируйте, что это работает.
 * 
 */
public class Main {
    public static void main(String[] args) {
        IsEven IsEven = new IsEven();
        IsPositive isPositive = new IsPositive();
        BeginsWithA beginsWithA = new BeginsWithA();
        BeginsWith beginsWith = new BeginsWith("abc");

        System.out.println(IsEven.isGood(4));
        System.out.println(isPositive.isGood(5));
        System.out.println(beginsWithA.isGood("Abcddg"));
        System.out.println(beginsWith.isGood("cbcddg"));

        List<String> list1 = Arrays.asList("one", "black", "abc", "abcd", "two", "Adfgs");
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(filter(list2, IsEven));
        System.out.println(filter(list2, isPositive));
        System.out.println(filter(list1, beginsWith));
        System.out.println(filter(list1, beginsWithA));

    }

    interface IsGood<T> {
        boolean isGood(T item);
    }

    public static <T> Iterable<T> filter(Iterable<T> list, IsGood<T> isGood) {
        List<T> newList = new ArrayList<>();
        for (T element : list) {
            if (isGood.isGood(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

}