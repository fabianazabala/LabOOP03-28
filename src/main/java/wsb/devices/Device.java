package wsb.devices;

public abstract class Device implements Saleable {
  final public String producer;
  final public String model;

  public Device(String producer, String model) {
    this.producer = producer;
    this.model = model;
  }

  public abstract void turnOn();

  public String getModel() {
    return this.model;
  }

  @Override
  public String toString() {
    return "Device{" +
        "producer='" + producer + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
