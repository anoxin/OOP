package com.example;

import java.util.Scanner;

public class FingerPrint extends UnlockerMethod {
  private String finger = "finger";

  public void checkFinger() {
    printInfo("Приложите палец");
    Scanner sc = new Scanner(System.in);
    String userFinger;
    int count = 5;
    while (count >= 0) {
      userFinger = sc.nextLine();
      if (userFinger.equals(finger)) {
        enter(true, null);
        count = -1;
      } else {
        if (count == 0) {
          System.out.println("Телефон заблокирован!");
        } else {
          enter(false, "Отпечаток не совпадает попробуйте ещё раз (" + count + ")");
        }
        count--;
      }
    }
    sc.close();
  }
}
