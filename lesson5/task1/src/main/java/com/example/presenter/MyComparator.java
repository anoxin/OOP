package com.example.presenter;

public class MyComparator implements java.util.Comparator<String> {

    public MyComparator() {
        super();
        // this.referenceLength = reference.length();
    }

    public int compare(String stringOne, String stringTwo) {
        int numberOne = Integer.parseInt(stringOne.substring(stringOne.indexOf("(") + 1,
                stringOne.indexOf("%)")));
        int numberTwo = Integer.parseInt(stringTwo.substring(stringTwo.indexOf("(") + 1,
                stringTwo.indexOf("%)")));

        return numberOne - numberTwo;
    }
}
