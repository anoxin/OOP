package com.example;

import com.example.Main.IsGood;

public class IsEven implements IsGood<Integer> {

  @Override
  public boolean isGood(Integer item) {
    if (item % 2 == 0) {
      return true;
    }

    return false;
  }

}
