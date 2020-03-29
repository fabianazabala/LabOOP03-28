package wsb.devices;

public class Diesel extends Car {
  public Diesel(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
    super(producer, model, yearOfProduction, sizeOfAnEngine);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public void Refuel() {

  }
}
