package com.example;

public class MutableList<T> extends MyList<T> {
  private T[] newArray;

  public MutableList(T[] array) {
    super(array);
    this.newArray = array;
  }

  public int getSize() {
    return getSize(newArray);
  }

  public T get(int i) {
    return get(i, newArray);
  }

  T[] set(int i, T newValue) {
    newArray[i] = newValue;
    return newArray;
  };

  T[] add(T newValue) {
    T[] arr = (T[]) new Object[newArray.length + 1];
    int count = 0;
    for (T item : newArray) {
      arr[count] = item;
      count++;
    }
    arr[count] = newValue;
    newArray = arr;
    return arr;

  }

  T[] remove(int value) {
    T[] arr = (T[]) new Object[newArray.length - 1];
    int count = 0;
    for (T item : newArray) {
      if (count != value) {
        arr[count] = item;
        count++;
      } else {
        value = -1;

      }
    }
    newArray = arr;
    return arr;
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
