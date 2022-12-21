package com.example;

import java.util.ArrayList;
import java.util.List;

public class RecordInFileJson extends RecordInFile {

  private List<String> list;

  public RecordInFileJson(List<String> list) {
    this.list = list;
  }

  public void createArrayJson(List<String> string) {
    List<String> jsonString = new ArrayList<>();
    jsonString.add("{\n");
    int count = 1;
    for (String item : string) {
      if (count < string.size()) {
        jsonString.add("\"" + item.split("=")[0] + "\": " + item.split("=")[1] + ",\n");
      } else {
        jsonString.add("\"" + item.split("=")[0] + "\": " + item.split("=")[1] + "\n");
      }
      count++;
    }
    jsonString.add("}\n");
    recordInFile(jsonString, "file.json");

  }

  @Override
  public String toString() {
    createArrayJson(list);
    return "Файл успешно записан";
  }

}
