package wsb.creatures;

import wsb.devices.Saleable;

public class Pet extends Animal implements Saleable {
  public Pet(String species) {
    super(species);
  }

  @Override
  public void eat() throws Exception {
    super.eat();
  }

  @Override
  public String toString() {
    return "Pet{" +
        "species='" + species + '\'' +
        ", name='" + name + '\'' +
        ", pic=" + pic +
        '}';
  }
}
