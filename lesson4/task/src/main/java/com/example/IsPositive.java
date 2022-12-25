package com.example;

import com.example.Main.IsGood;

public class IsPositive implements IsGood<Integer> {

  @Override
  public boolean isGood(Integer item) {
    if (item >= 0) {
      return true;
    }

    return false;
  }

}
