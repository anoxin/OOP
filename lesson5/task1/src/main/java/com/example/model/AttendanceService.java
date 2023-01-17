package com.example.model;

import java.time.LocalDate;
import java.util.Map;

public class AttendanceService {
  private String firstName;
  private String lastName;
  private Map<LocalDate, Boolean> info;

  public AttendanceService(String firstName, String lastName, Map<LocalDate, Boolean> info) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.info = info;
  }

  public int findProzent(Map<LocalDate, Boolean> info) {
    int count = 0;
    for (boolean value : info.values()) {
      if (value == true) {
        count++;
      }
    }
    return (100 / info.size() * count);

  }

  public String mapString(Map<LocalDate, Boolean> info) {
    String newString = "";
    for (Map.Entry<LocalDate, Boolean> entry : info.entrySet()) {
      LocalDate key = entry.getKey();
      Boolean value = entry.getValue();
      newString = newString + "," + key + "," + value;
    }
    return newString;

  }

  @Override
  public String toString() {
    return firstName + "," + lastName + "," + findProzent(info) + mapString(info);
  }

}
