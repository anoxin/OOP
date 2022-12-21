package com.example;

import java.util.ArrayList;
import java.util.List;

public class RecordInFileText extends RecordInFile {

  private List<String> list;

  public RecordInFileText(List<String> list) {
    this.list = list;
  }

  public void createArrayText(List<String> string) {
    List<String> textString = new ArrayList<>();
    for (String item : string) {
      textString.add(item.split("=")[0] + " = " + item.split("=")[1] + "\n");
    }
    recordInFile(textString, "file.txt");

  }

  @Override
  public String toString() {
    createArrayText(list);
    return "Файл успешно записан";
  }

}
