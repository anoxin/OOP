package com.example;

import java.util.Scanner;

public class Pin extends UnlockerMethod {
  private int pin = 1234;

  public void checkPin() {
    printInfo("Введите пин");
    Scanner sc = new Scanner(System.in);
    int enterPin;
    int count = 5;
    while (count >= 0) {
      enterPin = sc.nextInt();
      if (pin == enterPin) {
        enter(true, null);
        count = -1;
      } else {
        if (count == 0) {
          System.out.println("Телефон заблокирован!");
        } else {
          enter(false, "Неверный пин попробуйте ещё раз (" + count + ")");
        }
        count--;
      }
    }
    sc.close();
  }
}
