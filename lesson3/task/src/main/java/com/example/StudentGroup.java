package com.example;

import java.util.*;

public class StudentGroup implements Iterable<Student> {
  private List<Student> studentList;

  public StudentGroup(List<Student> studentList) {
    this.studentList = studentList;
  }

  public int sizeOfGroup() {
    return this.studentList.size();
  }

  public Student getStudent(int index) {
    return this.studentList.get(index);
  }

  @Override
  public Iterator<Student> iterator() {

    return new StudentGroupIterator(this);
  }

  public ListIterator<Student> listIterator(int sizeOfGroup) {
    return new GroupListIterator(this, sizeOfGroup);
  }

  public Iterator<Student> descendingIterator(int sizeOfGroup) {
    return new ReverseIterator(this, sizeOfGroup);
  }

}
