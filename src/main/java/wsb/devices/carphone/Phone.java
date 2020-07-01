package wsb.devices.carphone;

import wsb.creatures.Human;
import wsb.devices.Device;
import wsb.devices.Saleable;

public class Phone extends Device implements Saleable {
  final Double screenSize;

  public Phone(String producer, String model, Double screenSize) {
    super(producer, model);
    this.screenSize = screenSize;
  }

 /* public void installAnApp(String name, Double version) {
    if(app.getPrice() > 0){
      if(owner.cash < app.getPrice()){
        throw new Exception("not enough money");
      }
      owner.cash -= app.getPrice();
      applications.add(app);

    }
    System.out.println("The app " + name + " was installed in version " + version);
  } */

  @Override
  public void turnOn() {
    System.out.println("the phone is turned on");
  }

  @Override
  public void sell(Human buyer, Human seller, double price) throws Exception {

  }

  @Override
  public String toString() {
    return "Phone{" +
        "screenSize=" + screenSize +
        ", producer='" + producer + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
