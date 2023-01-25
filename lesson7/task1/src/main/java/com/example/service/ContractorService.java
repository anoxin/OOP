package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.model.Contractor;
import com.example.util.DataReader;
import com.example.util.DataWriter;

public class ContractorService implements DataService<Contractor> {

    private final String path = "contractorsDB.txt";

    private List<Contractor> contractors = new ArrayList<>();
    Scanner scanner = new Scanner(System.in, "cp866");;

    public List<Contractor> getUsers() {
        return new ArrayList<>(contractors);
    }

    @Override
    public void addUser(Contractor contractor) {
        contractors.add(contractor);
    }

    @Override
    public void save() {
        DataWriter.dataWrite(contractors);
    }

    @Override
    public void load() {
        contractors = DataReader.dataRead(path);
    }

    @Override
    public void addNewContact() {
        Contractor info = find();

        String choice = addUserInfoSting("Выберите пункт для добавления способ связи 1-телефон 2-email 3-vk 4-адрес");
        if (choice.equals("1")) {
            List<String> newList = new ArrayList<String>(info.getPhones());
            newList.add(addUserInfoSting("Введите телефон"));
            info.setPhones(newList);
        }
        if (choice.equals("2")) {
            List<String> newList = new ArrayList<String>(info.getEmails());
            newList.add(addUserInfoSting("Введите email"));
            info.setEmails(newList);
        }
        if (choice.equals("3")) {
            List<String> newList = new ArrayList<String>(info.getVk());
            newList.add(addUserInfoSting("Введите vk"));
            info.setVk(newList);
        }
        if (choice.equals("4")) {
            List<String> newList = new ArrayList<String>(info.getAddresses());
            newList.add(addUserInfoSting("Введите адрес"));
            info.setAddress(newList);
        }

        int count = 0;
        int countFind = 0;
        for (Contractor item : contractors) {
            if (item.equals(info)) {
                countFind = count;
            }
            count++;
        }
        contractors.set(countFind, info);
        System.out.println("Данные были изменены \n");

    }

    @Override
    public void removeContact() {
        Contractor info = find();

        String choice = addUserInfoSting("Выберите пункт для удаления способа связи 1-телефон 2-email 3-vk 4-адрес");
        if (choice.equals("1")) {
            List<String> newList = new ArrayList<String>(info.getPhones());
            removeData(newList);
            info.setPhones(newList);
        }
        if (choice.equals("2")) {
            List<String> newList = new ArrayList<String>(info.getEmails());
            removeData(newList);
            info.setEmails(newList);
        }
        if (choice.equals("3")) {
            List<String> newList = new ArrayList<String>(info.getVk());
            removeData(newList);
            info.setVk(newList);
        }
        if (choice.equals("4")) {
            List<String> newList = new ArrayList<String>(info.getAddresses());
            removeData(newList);
            info.setAddress(newList);
        }

        int count = 0;
        int countFind = 0;
        for (Contractor item : contractors) {
            if (item.equals(info)) {
                countFind = count;
            }
            count++;
        }
        contractors.set(countFind, info);
        System.out.println("Данные были изменены \n");

    }

    @Override
    public Contractor find() {
        Contractor info = findItem(contractors).get(0);
        while (addUserInfoSting("Поиск завершен нажмите (Y) чтобы начать поиск заново или (N) для выхода из поиска")
                .equals("Y")) {
            info = findItem(contractors).get(0);
        }
        System.out.println("\n");
        return info;
    }

    @Override
    public void remove() {
        Contractor info = find();
        if (info != null) {
            if (addUserInfoSting("Удалить запись? Y(N)").equals("Y")) {
                contractors.remove(info);
                System.out.println("Запись удалена!\n");
            }
        } else {
            if (addUserInfoSting("Запись не выбран начать поиск заново? Y(N)").equals("Y")) {
                remove();
            }

        }

    }

    public List<Contractor> findItem(List<Contractor> items) {
        List<Contractor> contractorFind = new ArrayList<>();
        String answer = addUserInfoSting("Введите данные для поиска");
        for (Contractor item : items)
            if (item.toFileString().indexOf(answer) >= 0) {
                contractorFind.add(item);
                System.out.println(item);
            }
        if (contractorFind.size() > 1) {
            System.out.println("Найдено " + contractorFind.size() + " записи уточните поиск");
            findItem(contractorFind);
        }
        if (contractorFind.size() == 0) {
            System.out.println("Запись не найдена");
            contractorFind.add(null);
        }

        return contractorFind;
    }

    public String addUserInfoSting(String info) {
        System.out.println(info);
        String str = scanner.next();
        return str;
    }

    public List<String> removeData(List<String> newList) {
        int count = 0;
        System.out.println("Выберите файл для удаления");
        for (String item : newList) {
            System.out.printf("%d-%s ", count, item);
            count++;
        }
        newList.remove(Integer.parseInt(addUserInfoSting("")));
        return newList;

    }

}
