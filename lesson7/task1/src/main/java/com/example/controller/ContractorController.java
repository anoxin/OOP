package com.example.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.model.Contractor;
import com.example.service.ContractorService;
import com.example.ui.ContractorView;

public class ContractorController implements UserController {

    private ContractorService model;
    private ContractorView view;
    Scanner scanner = new Scanner(System.in, "cp866");

    public ContractorController(ContractorService model, ContractorView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void showMenu() {
        while (true) {
            System.out.println("Выберите действие");
            System.out.println("1. Посмотреть список контрагентов");
            System.out.println("2. Найти контрагента по названию");
            System.out.println("3. Добавить контрагента");
            System.out.println("4. Удалить контрагента");
            System.out.println("5. Добавить новый способ связаться с контрагентом");
            System.out.println("6. Удалить способ связаться с контрагентом");
            System.out.println("7. Выход");

            int index = scanner.nextInt();
            model.load();

            switch (index) {
                case 1:
                    view.showUsers();
                    break;
                case 2:
                    model.find();
                    break;
                case 3:
                    model.addUser(new Contractor(addUserInfoSting("Введите имя"),
                            addUserInfoSting("Введите фамилию"),
                            addUserInfoSting("Введите возраст"),
                            addUserInfoSting("Введите ник"),
                            addUserInfoArray("Введите телефон", "телефон"),
                            addUserInfoArray("Введите email", "email"),
                            addUserInfoArray("Введите vk", "vk"),
                            addUserInfoArray("Введите адрес", "адрес")));
                    model.save();
                    break;
                case 4:
                    model.remove();
                    model.save();
                    break;
                case 5:
                    model.addNewContact();
                    model.save();
                    break;
                case 6:
                    model.removeContact();
                    model.save();
                    break;
            }
            if (index == 7) {
                break;
            }
        }
    }

    public String addUserInfoSting(String info) {
        System.out.println(info);
        String str = scanner.next();
        return str;
    }

    public ArrayList<String> addUserInfoArray(String info, String type) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(info);
        list.add(scanner.next());
        while (true) {
            System.out.println("Хотите добавить " + type + " ( 1 - Да, 2 - Нет");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.println(info);
                list.add(scanner.next());
            } else {
                return list;
            }

        }
    }

}
