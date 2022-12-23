package com.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Класс Группа содержит в себе коллекцию Студентов. По группе можно
 * перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной
 * работы). Остальные задачи надстраиваются поверх неё.
 * 
 * Создайте класс GroupListIterator, который позволяет перемещаться по группе в
 * обоих направлениях. Он реализует интерфейс ListIterator<Student>.
 * Добавьте в Группу метод listIterator (), который позволяет начать итерацию с
 * помощью GroupListIterator.
 * 
 * Создайте класс ReverseIterator, который работает как итератор по группе в
 * обратном направлении:
 * • Он отслеживает текущую позицию в переборе
 * • Он изначально выставлен на конечную позицию
 * • Он движется справа налево
 * Проверьте, как он работает.
 *
 * 
 */
public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
                new Student("Иванов", 4.8f, "01.05.1985"),
                new Student("Сидоров", 4.5f, "01.02.1985"),
                new Student("Петров", 4.3f, "01.02.1987")));

        // StudentGroupIterator studentIt = new StudentGroupIterator(studentGroup);
        Iterator<Student> studentIt = studentGroup.iterator();
        while (studentIt.hasNext()) {
            System.out.println(studentIt.next());
        }

        System.out.println();

        ListIterator<Student> studentIt1 = studentGroup.listIterator(studentGroup.sizeOfGroup());

        while (studentIt1.hasNext()) {
            System.out.println(studentIt1.next());
        }
        System.out.println();

        while (studentIt1.hasPrevious()) {
            System.out.println(studentIt1.previous());
        }
        System.out.println();

        Iterator<Student> studentIt2 = studentGroup.descendingIterator(studentGroup.sizeOfGroup());

        while (studentIt2.hasNext()) {
            System.out.println(studentIt2.next());

        }
    }

}
