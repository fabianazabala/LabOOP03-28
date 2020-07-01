package wsb.devices.carphone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import wsb.creatures.Human;
import wsb.devices.Device;
import wsb.devices.Saleable;

public abstract class Car extends Device implements Saleable {
  public final Integer yearOfProduction;
  public final Double sizeOfAnEngine;
  public String plates;
  public double price;

  public Car(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
    super(producer, model);
    this.yearOfProduction = yearOfProduction;
    this.sizeOfAnEngine = sizeOfAnEngine;
  }

  public abstract void refuel();

  @Override
  public void turnOn() {
    System.out.println("Your car is ready to go");
  }

  @Override
  public void sell(Human buyer, Human seller, double price) {
    if (buyer.cash >= price) {
      buyer.setCars(addToGarage(buyer.getCars()));
      buyer.cash = buyer.cash - price;
      seller.cash = seller.cash + price;
      seller.setCars(removeFromGarage(seller.getCars()));
      System.out.println(buyer + " just bought a new " + producer);
    } else {
      throw new RuntimeException("You do not have enough cash to buy a car");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Double.compare(car.price, price) == 0 &&
        Objects.equals(yearOfProduction, car.yearOfProduction) &&
        Objects.equals(sizeOfAnEngine, car.sizeOfAnEngine) &&
        Objects.equals(plates, car.plates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yearOfProduction, sizeOfAnEngine, plates, price);
  }

  private Car[] addToGarage(Car[] garage) {
    List<Car> carList = garage == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(garage));
    carList.add(this);
    return carList.toArray(new Car[0]);
  }

  private Car[] removeFromGarage(Car[] garage) {
    List<Car> carList = new ArrayList<>(Arrays.asList(garage));
    carList.remove(this);
    return carList.toArray(new Car[0]);
  }

  @Override
  public String toString() {
    return "Car{" +
        "yearOfProduction=" + yearOfProduction +
        ", sizeOfAnEngine=" + sizeOfAnEngine +
        ", plates='" + plates + '\'' +
        ", price=" + price +
        ", producer='" + producer + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
