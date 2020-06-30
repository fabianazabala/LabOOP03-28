package wsb.creatures;

public class FarmAnimal extends Animal implements Edible, Feedable {
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
}
