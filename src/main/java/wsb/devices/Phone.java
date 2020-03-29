package wsb.devices;

import wsb.creatures.Human;

public class Phone extends Device {
  final Double screenSize;

  public Phone(String producer, String model, Double screenSize) {
    super(producer, model);
    this.screenSize = screenSize;
  }

  public void installAnApp(String name, Double version) {
    System.out.println("The app " + name + " was installed in version " + version);
  }

  @Override
  public void turnOn() {
    System.out.println("phone is turned on");
  }

  @Override
  public void sell(Human buyer, Human seller, double price) throws Exception {

  }
}
