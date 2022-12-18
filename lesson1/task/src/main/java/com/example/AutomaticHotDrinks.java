package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AutomaticHotDrinks extends TradingAutomat {

    private Map<Integer, HotDrink> productsMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private Scanner scannerString = new Scanner(System.in);

    public void addProduct(int key, HotDrink goods) {
        productsMap.put(key, goods);
    }

    public String showName(int number) {
        return productsMap.get(number).getName();
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink item : productsMap.values()) {
            if (item.getName().equals(name) && item.getVolume() == volume && item.getTemperature() == temperature) {
                return item;
            }
        }
        return null;
    }

    @Override
    public int enterNumber() {
        int productNumber = scanner.nextInt();
        System.out.println("Покупатель ввел номер " + productNumber);
        return productNumber;
    }

    @Override
    public HotDrink showGoods(int productNumber) {
        if (productNumber == 5) {
            System.out.println("Введите через пробел название, объем и температуру");
            String search = scannerString.nextLine();
            String[] info = (search).split(" ");
            HotDrink product = getProduct(info[0], Integer.parseInt(info[1]),
                    Integer.parseInt(info[2]));
            if (product != null) {
                System.out.println("Выбранный продукт: " + product);
                return product;
            } else {
                System.out.println("Такого товара нет");
                return showGoods(5);
            }

        }
        System.out.println("Выбранный продукт: " + productsMap.get(productNumber));
        return productsMap.get(productNumber);
    }

    @Override
    public void goodsBuy(HotDrink goods) {
        System.out.println("Внесите деньги для покупки товара: ");
        float deposit = 0f;
        while (true) {
            int cash = scanner.nextInt();
            deposit += cash;
            if (deposit < goods.getPrice()) {
                System.out.printf("Нужно еще %f\n", goods.getPrice() - deposit);

            } else if (deposit > goods.getPrice()) {
                System.out.printf("Ваша сдача %f\n", deposit - goods.getPrice());
                System.out.println("Возьмите ваш товар.");
                getGoods(goods);
                break;
            } else {
                System.out.println("Возьмите ваш товар. Спасибо!");
                getGoods(goods);
                break;
            }
        }
        System.out.println("Спасибо за покупку!!!");
    }

    private void getGoods(HotDrink goods) {
        int amountGoods = goods.getAmount();
        goods.setAmount(amountGoods - 1);
        System.out.println("Количество товара " + goods.getAmount());
    }
}
