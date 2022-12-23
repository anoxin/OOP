package com.example;

public class Student {
  private String name;
  private float averageBall;
  private String dateOfBirth;

  public Student(String name, float averageBall, String dateOfBirth) {
    this.name = name;
    this.averageBall = averageBall;
    this.dateOfBirth = dateOfBirth;
  }

  public String getName() {
    return name;
  }

  public float getAverageBall() {
    return averageBall;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", averageBall=" + averageBall + ", dateOfBirth=" + dateOfBirth + "]";
  }

}
