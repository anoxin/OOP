package com.example;

import java.util.Scanner;

// Задача 1. Чтобы разблокировать телефон, пользователь может выбрать один из способов:

// • Без пароля
// • С пин-кодом (4-значное число)
// • По отпечатку пальца (кодируется строкой)
// • По распознаванию лица (кодируется строкой)

// Программист написал класс Unlocker, в котором хранятся поля от всех способов сразу:

// class Unlocker {
// private int mode; // режим
// private int pin; // на случай пин-кода
// private String fingerprint; // на случай отпечатка пальца
// private String faceID; // на случай лица
// }

// Здесь нарушен принцип SRP: класс имеет несколько незаивисимых причин меняться.

// Напишите решение, которое будет соответствовать SRP и OCP (мы хотим в будущем добавлять новые способы разблокировки).

public class Main {
  public static void main(String[] args) {
    System.out.println(
        "Выберите тип входа: \n 1 - Без пароля \n 2 -  С пин-кодом (4-значное число) \n 3 -  По отпечатку пальца (кодируется строкой) \n 4 -  По распознаванию лица (кодируется строкой)");
    Scanner sc = new Scanner(System.in);
    int enter = sc.nextInt();
    if (enter == 1) {
      new NotPassword().check();
    }
    if (enter == 2) {
      new Pin().checkPin();
    }
    if (enter == 3) {
      new FingerPrint().checkFinger();

    }
    if (enter == 4) {
      new FaceID().checkFace();
    }
    sc.close();
  }

}
