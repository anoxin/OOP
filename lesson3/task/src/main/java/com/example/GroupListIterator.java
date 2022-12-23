package com.example;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
  private int index = -1;
  private int sizeOfGroup;
  private StudentGroup studentGroup;

  public GroupListIterator(StudentGroup studentGroup, int sizeOfGroup) {
    this.sizeOfGroup = sizeOfGroup;
    this.studentGroup = studentGroup;
  }

  @Override
  public void add(Student e) {

  }

  @Override
  public boolean hasNext() {
    return index < studentGroup.sizeOfGroup() - 1;
  }

  @Override
  public int nextIndex() {
    return 0;
  }

  @Override
  public Student next() {
    index++;
    return studentGroup.getStudent(this.index);
  }

  @Override
  public boolean hasPrevious() {

    return sizeOfGroup > 0;
  }

  @Override
  public int previousIndex() {
    return 0;
  }

  @Override
  public Student previous() {
    sizeOfGroup--;
    return studentGroup.getStudent(this.sizeOfGroup);
  }

  @Override
  public void remove() {
  }

  @Override
  public void set(Student e) {
  }

}
