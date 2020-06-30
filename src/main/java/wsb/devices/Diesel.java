package wsb.devices;

import wsb.devices.carphone.Car;

public class Diesel extends Car {
  public Diesel(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
    super(producer, model, yearOfProduction, sizeOfAnEngine);
  }

  @Override
  public void refuel() {
    System.out.println(this + "\nNow your tank is full of diesel");

  }

  @Override
  public String toString() {
    return "Diesel{" +
        "yearOfProduction=" + yearOfProduction +
        ", sizeOfAnEngine=" + sizeOfAnEngine +
        ", plates='" + plates + '\'' +
        ", price=" + price +
        ", producer='" + producer + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
