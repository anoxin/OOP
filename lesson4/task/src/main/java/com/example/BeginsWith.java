package com.example;

import com.example.Main.IsGood;

public class BeginsWith implements IsGood<String> {
  private String saveString;

  public BeginsWith(String saveString) {
    this.saveString = saveString;
  }

  @Override
  public boolean isGood(String item) {
    if (item.substring(0, saveString.length()).equals(saveString)) {
      return true;
    }

    return false;
  }

  public String getSaveString() {
    return saveString;
  }

  public void setSaveString(String saveString) {
    this.saveString = saveString;
  }

}
