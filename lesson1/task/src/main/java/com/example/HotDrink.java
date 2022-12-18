package com.example;

public class HotDrink extends Goods {
  private int volume;
  private int temperature;

  public HotDrink(String name, int artikl, float price, int amount, int volume, int temperature) {
    super(name, artikl, price, amount);
    this.volume = volume;
    this.temperature = temperature;
  }

  public int getTemperature() {
    return temperature;
  }

  public int getVolume() {
    return volume;
  }

  @Override
  public String toString() {
    return "HotDrink [" +
        "name='" + name + '\'' +
        ", artikl=" + artikl +
        ", price=" + price +
        ", amount=" + amount +
        ", volume=" + volume +
        ", temperature=" + temperature + "]";
  }

}
