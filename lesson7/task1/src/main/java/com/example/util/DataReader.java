package com.example.util;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.model.Contractor;

public class DataReader {

    public static List<Contractor> dataRead(String path) {
        List<Contractor> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = bf.readLine()) != null) {

                String[] arrayOne = str.split(", ");
                String[] arrayTwo = str.split("\\], \\[");

                list.add(new Contractor(arrayOne[0], arrayOne[1], arrayOne[2], arrayOne[3],
                        Arrays.asList(arrayTwo[0].split("\\[")[1].split(", ")),
                        Arrays.asList(arrayTwo[1].split(", ")),
                        Arrays.asList(arrayTwo[2].split(", ")),
                        Arrays.asList(arrayTwo[3].split("\\]")[0].split(", "))));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
