package com.example;

import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {

  private int sizeOfGroup;
  private StudentGroup studentGroup;

  public ReverseIterator(StudentGroup studentGroup, int sizeOfGroup) {
    this.sizeOfGroup = sizeOfGroup;
    this.studentGroup = studentGroup;
  }

  @Override
  public boolean hasNext() {
    return sizeOfGroup > 0;
  }

  @Override
  public Student next() {
    sizeOfGroup--;
    return studentGroup.getStudent(this.sizeOfGroup);
  }

}
