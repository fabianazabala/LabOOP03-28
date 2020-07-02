package wsb.creatures;

import wsb.devices.Saleable;

public class FarmAnimal extends Animal implements Edible, Feedable, Saleable {
  public FarmAnimal(String species) {
    super(species);
  }

  @Override
  public void feed(Double foodWeight) {

  }

  @Override
  public String toString() {
    return "FarmAnimal{" +
        "species='" + species + '\'' +
        ", name='" + name + '\'' +
        ", pic=" + pic +
        '}';
  }

  @Override
  public void beEaten() throws Exception {

  }
}
