package com.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.example.model.AttendanceService;
import com.example.presenter.Presenter;

/**
 * Напишите программу, позволяющую анализировать посещаемость студентов.
 * Используйте паттерн MVP.
 * 
 * Есть группа студентов. Для каждого студента есть журнал его посещаемости:
 * список дат занятий и для каждой даты — посетил студент занятие или нет.
 * Создайте класс AttendanceService (сервис посещаемости), в котором хранится
 * информация обо всех студентах.
 * 
 * Создайте класс AttendanceView, который позволяет отображать студентов и их
 * посещаемость.
 * 
 * Создайте класс presenter со следующими функциями:
 * • Распечатать всех студентов и посещаемость каждого в процентах
 * • Распечатать студентов, отсортировав их по убыванию посещаемости (вверху
 * самые посещающие)
 * • Распечатать студентов с посещаемостью ниже 25%
 * 
 * Проверьте, как это работает.
 *
 * 
 */
public class Main {
    public static void main(String[] args) {
        Map<LocalDate, Boolean> studentOne = new HashMap<LocalDate, Boolean>();
        studentOne.put(LocalDate.of(2022, 10, 5), true);
        studentOne.put(LocalDate.of(2022, 10, 6), true);
        studentOne.put(LocalDate.of(2022, 10, 7), true);
        studentOne.put(LocalDate.of(2022, 10, 8), true);

        Map<LocalDate, Boolean> studentTwo = new HashMap<LocalDate, Boolean>();
        studentTwo.put(LocalDate.of(2022, 10, 5), false);
        studentTwo.put(LocalDate.of(2022, 10, 6), true);
        studentTwo.put(LocalDate.of(2022, 10, 7), false);
        studentTwo.put(LocalDate.of(2022, 10, 8), false);

        Map<LocalDate, Boolean> studentThree = new HashMap<LocalDate, Boolean>();
        studentThree.put(LocalDate.of(2022, 10, 5), false);
        studentThree.put(LocalDate.of(2022, 10, 6), true);
        studentThree.put(LocalDate.of(2022, 10, 7), false);
        studentThree.put(LocalDate.of(2022, 10, 8), true);

        Map<LocalDate, Boolean> studentFour = new HashMap<LocalDate, Boolean>();
        studentFour.put(LocalDate.of(2022, 10, 5), false);
        studentFour.put(LocalDate.of(2022, 10, 6), false);
        studentFour.put(LocalDate.of(2022, 10, 7), false);
        studentFour.put(LocalDate.of(2022, 10, 8), false);
        List<AttendanceService> students = Arrays.asList(
                new AttendanceService("Anton", "Anokhin", studentOne),
                new AttendanceService("Artem", "Alecseev", studentTwo),
                new AttendanceService("Denis", "Zaizev", studentThree),
                new AttendanceService("Roman", "Pojidaev", studentFour));

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out
                    .println(
                            "Выберите значение \n 1 - Распечатать всех студентов и посещаемость каждого в процентах, \n 2 - Распечатать студентов, отсортировав их по убыванию посещаемости (вверху* самые посещающие) \n 3 - Распечатать студентов с посещаемостью ниже 25% \n 4 - выход");
            int number = reader.nextInt();
            if (number == 1) {
                new Presenter().buttonClickOne(students);
                // System.out.println(students.toString());
            }
            if (number == 2) {
                new Presenter().buttonClickTwo(students);
            }
            if (number == 3) {
                new Presenter().buttonClickThree(students);

            }
            if (number == 4) {
                break;
            }
        }
        reader.close();

    }

    public Map<LocalDate, Boolean> addHachMap(Map<LocalDate, Boolean> info) {
        return null;
    }
}
