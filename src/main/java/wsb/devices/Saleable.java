package wsb.devices;

import wsb.creatures.Human;

public interface Saleable {
  public void sell(Human buyer, Human seller, double price) throws Exception;
}
