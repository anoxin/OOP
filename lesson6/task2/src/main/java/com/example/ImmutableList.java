package com.example;

public class ImmutableList<T> extends MyList<T> {
  private T[] newArray;

  public ImmutableList(T[] array) {
    super(array);
    this.newArray = array;
  }

  public int getSize() {
    return getSize(newArray);
  }

  public T get(int i) {
    return get(i, newArray);
  }

  @Override
  public String toString() {
    int count = 0;
    String str = "[ ";
    for (T item : newArray) {
      str = str + item;
      count++;
      if (count < newArray.length) {
        str = str + ", ";
      }
    }
    str = str + " ]";
    return str;

  }

}
