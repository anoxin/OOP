package com.example;

import com.example.service.ContractorService;
import com.example.ui.ContractorView;
import com.example.controller.ContractorController;

/*
Напишите приложение, которое позволяет пользователю управлять своим списком контактов. Используйте наследование, полиморфизм, принципы SOLID.

Контрагент — это либо человек, либо компания.

У каждого контрагента есть список способов связаться: телефон, email, ник в telegram, адрес страницы VK, уличный адрес. Разрешается, что у одного контрагента сколько угодно способов связаться, например, несколько телефонов или несколько адресов.

Программа должна позволять следующие действия:

• Посмотреть список контрагентов
• Найти контрагента по названию. Посмотреть подробную информацию о нём
• Добавить контрагента
• Удалить контрагента
• Добавить новый способ связаться с контрагентом
• Удалить способ связаться с контрагентом

Если задача кажется слишком простой, вы можете выбрать следующие необязательные усложнения:

• Используйте паттерн MVC или MVP для архитектуры приложения
• Решите задачу на языке, отличном от Java
• Возможность сохранять книгу контактов в файл, загружать из файла

 */
public class Main {
    public static void main(String[] args) {

        // ContractorService contractorService = new ContractorService();
        // contractorService.addUser(new Contractor("Anton", "Anokhin", "30",
        // "myNick",
        // new ArrayList<String>(Arrays.asList("89303441223", "896023231221")),
        // new ArrayList<String>(Arrays.asList("my@mail.ru", "my@yandex.ru")),

        // new ArrayList<String>(Arrays.asList("https://vk.com/my",
        // "https://vk.com/my2")),
        // new ArrayList<String>(Arrays.asList("г. Москва ул. Федора Полетаева"))));
        // contractorService.addUser(new Contractor("Artem", "Sokolov", "30", "myNick",
        // new ArrayList<String>(Arrays.asList("89303441223", "896023231221")),
        // new ArrayList<String>(Arrays.asList("my@mail.ru", "my@yandex.ru")),
        // new ArrayList<String>(Arrays.asList("https://vk.com/my",
        // "https://vk.com/my2")),
        // new ArrayList<String>(Arrays.asList("г. Москва ул. рязанский проспект"))));

        // contractorService.save();

        ContractorService model = new ContractorService();
        ContractorController contractorController = new ContractorController(model,
                new ContractorView(model));

        contractorController.showMenu();

    }
}
