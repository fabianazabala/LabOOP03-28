package wsb.devices;

public class Diesel extends Car {
  public Diesel(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
    super(producer, model, yearOfProduction, sizeOfAnEngine);
  }

  @Override
  public String toString() {
    return "The producer is: " + producer +
        " \nThe model is: " + model +
        "\nThe year of production is:  " + yearOfProduction
        + " \nThe size of engine is: " + sizeOfAnEngine;
  }

  @Override
  public void refuel() {
    System.out.println(this + "\nNow your tank is full of diesel");

  }
}
