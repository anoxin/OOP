package com.example;

import java.util.Scanner;

public class FaceID extends UnlockerMethod {
  private String face = ":-)";

  public void checkFace() {
    printInfo("Отсканируйте лицо");
    Scanner sc = new Scanner(System.in);
    String userFace;
    int count = 5;
    while (count >= 0) {
      userFace = sc.nextLine();
      if (userFace.equals(face)) {
        enter(true, null);
        count = -1;
      } else {
        if (count == 0) {
          System.out.println("Телефон заблокирован!");
        } else {
          enter(false, "Лицо не совпадает попробуйте ещё раз (" + count + ")");
        }
        count--;
      }
    }
    sc.close();
  }
}
