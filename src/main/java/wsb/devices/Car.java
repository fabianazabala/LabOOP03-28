package wsb.devices;

import wsb.creatures.Human;

public class Car extends Device {
  public final Integer yearOfProduction;
  public final Double sizeOfAnEngine;
  public String plates;

  public Car(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
    super(producer, model);
    this.yearOfProduction = yearOfProduction;
    this.sizeOfAnEngine = sizeOfAnEngine;

  }

  @Override
  public void turnOn() {
    System.out.println("car is ready to go");
  }

  @Override
  public void sell(Human buyer, Human seller, double price) {
    if (buyer.cash >= price) {
      buyer.car = this;
      buyer.cash = buyer.cash - price;
      seller.cash = seller.cash + price;
      seller.car = null;
    } else {
      throw new RuntimeException("You do not have enough cash to buy a car");
    }
  }
}
