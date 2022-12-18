package com.example;

import java.util.Objects;

public class Goods {
    protected String name;
    protected int artikl;
    protected float price;
    protected int amount;

    public Goods(String name, int artikl, float price, int amount) {
        this.name = name;
        this.artikl = artikl;
        this.price = price;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArtikl() {
        return artikl;
    }

    public void setArtikl(int artikl) {
        this.artikl = artikl;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Goods goods = (Goods) o;
        return artikl == goods.artikl && Float.compare(goods.price, price) == 0 && amount == goods.amount
                && Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artikl, price, amount);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", artikl=" + artikl +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
