package wsb.devices;

import wsb.creatures.Human;

public interface Soldable {
  public void sell(Human buyer, Human seller, double price) throws Exception;
}
