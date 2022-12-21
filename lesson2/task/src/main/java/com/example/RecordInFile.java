package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RecordInFile {
  public void recordInFile(List<String> array, String name) {
    try (FileWriter writer = new FileWriter(name, false)) {
      for (String string : array) {
        writer.write(string);
        writer.flush();

      }
      System.out.println("Информация отправлена");
    } catch (IOException ex) {

      System.out.println(ex.getMessage());
    }

  }

}
