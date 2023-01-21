package com.example;

public class MyList<T> {

  public MyList(T[] array) {
  }

  public int getSize(T[] newArray) {
    int count = 0;
    for (T item : newArray) {
      item.equals(item);
      count++;
    }
    return count;
  };

  public T get(int i, T[] newArray) {
    int count = 0;
    for (T item : newArray) {
      if (count == i) {
        return item;
      }
      count++;
    }
    return null;
  }

}
