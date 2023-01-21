package com.example;

public class UnlockerMethod {

  protected void printInfo(String info) {
    System.out.println(info);
  };

  protected void enter(boolean answer, String error) {
    if (answer) {
      System.out.println(" Добро пожаловать!!!");
    } else {
      System.out.println(error);
    }

  }
}
