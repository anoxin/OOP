package com.example.presenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.model.AttendanceService;
import com.example.view.AttendanceView;

public class Presenter {

    public void buttonClickOne(List<AttendanceService> students) {
        new AttendanceView().printStudents(addInfo(students, "").strip());

    }

    public void buttonClickTwo(List<AttendanceService> students) {
        List<String> stringArray = new ArrayList<String>(Arrays.asList(addInfo(students, "#").split("#")));

        MyComparator studentSort = new MyComparator();

        java.util.Collections.sort(stringArray, studentSort);
        for (String item : stringArray) {
            new AttendanceView().printStudents(item.strip() + "\n");
        }

    }

    public void buttonClickThree(List<AttendanceService> students) {
        List<String> stringArray = new ArrayList<String>(Arrays.asList(addInfo(students, "#").split("#")));

        for (String item : stringArray) {
            int number = Integer.parseInt(item.substring(item.indexOf("(") + 1,
                    item.indexOf("%)")));
            if (number <= 25) {
                new AttendanceView().printStudents(item.strip() + "\n");
            }

        }

        addInfo(students, "");

    }

    private String addInfo(List<AttendanceService> students, String str) {
        String stringStudents = "";
        for (AttendanceService student : students) {
            String[] array = student.toString().split(",");
            int count = 0;
            for (String info : array) {
                if (count == 0) {
                    stringStudents = stringStudents + info + " ";
                } else if (count == 1) {
                    stringStudents = stringStudents + info + " ";
                } else if (count == 2) {
                    stringStudents = stringStudents + "(" + info + "%)" + " \n";
                } else if (count % 2 != 0) {
                    stringStudents = "\n" + stringStudents + info + " - ";
                } else if (count % 2 == 0) {
                    stringStudents = stringStudents + info + ";\n";
                }
                count++;

            }
            stringStudents = stringStudents + "\n" + str;
        }
        return stringStudents;

    }
}
