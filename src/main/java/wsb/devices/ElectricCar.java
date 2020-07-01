package wsb.devices;

import wsb.devices.carphone.Car;

public class ElectricCar extends Car implements Saleable {
  public ElectricCar(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
    super(producer, model, yearOfProduction, sizeOfAnEngine);
  }

  @Override
  public void refuel() {
    System.out.println("Now your battery is charged");
  }

  @Override
  public String toString() {
    return "ElectricCar{" +
        "yearOfProduction=" + yearOfProduction +
        ", sizeOfAnEngine=" + sizeOfAnEngine +
        ", plates='" + plates + '\'' +
        ", price=" + price +
        ", producer='" + producer + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
