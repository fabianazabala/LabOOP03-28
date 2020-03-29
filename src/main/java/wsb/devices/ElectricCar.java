package wsb.devices;

public class ElectricCar extends Car {
  public ElectricCar(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
    super(producer, model, yearOfProduction, sizeOfAnEngine);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public void refuel() {
    System.out.println("Now your battery is charged");
  }
}
