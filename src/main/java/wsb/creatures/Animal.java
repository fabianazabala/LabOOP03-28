package wsb.creatures;

import java.io.File;
import wsb.devices.Saleable;

public abstract class Animal implements Saleable, Edible, Feedable {
  final String species;
  private Double weight;
  public String name;
  File pic;
  private boolean alive;

  private static Double NEW_DOG_WEIGHT = 4.0;
  private static Double NEW_LION_WEIGHT = 39.2;
  private static Double NEW_OTHER_ANIMAL_WEIGHT = 5.3;

  public Animal(String species) {
    System.out.println("we have created new Animal");
    this.species = species;

    switch (species) {
      case "dog": {
        weight = NEW_DOG_WEIGHT;
        break;
      }
      case "lion": {
        weight = NEW_LION_WEIGHT;
        break;
      }
      default: {
        weight = NEW_OTHER_ANIMAL_WEIGHT;
        break;
      }
    }
  }


  public void feed() {
    if (weight == 0) {
      System.out.println("too late, " + name + " is dead");
    } else {
      ++weight;
      System.out.println(name + " says thanks for food");
    }
  }

  @Override
  public void feed(Double foodWeight) {

  }

  public void feed(String food) {
    if (alive) {
      System.out.println("Thanks for " + food);
    }
  }

  public void takeForAWalk() {
    if (weight == 0.0) {
      System.out.println("you can't walk the street with dead animal you freak");
    } else if (weight > 3.0) {
      --weight;
      System.out.println(name + " says thanks for a walk");
    } else if (weight > 1.0) {
      --weight;
      System.out.println(name + " says thanks for a walk but I'm hungry");
    } else {
      weight = 0.0;
      System.out.println(name + " died");
    }
  }

  Double getWeight() {

    return weight;
  }


  @Override
  public void sell(Human buyer, Human seller, double price) throws Exception {
    System.out.println("now give me the money");
  }

  @Override
  public void eat() throws Exception {
    System.out.println("that was yummy");
  }

  @Override
  public String toString() {
    return "Animal{" +
        "species='" + species + '\'' +
        ", weight=" + weight +
        ", name='" + name + '\'' +
        ", pic=" + pic +
        ", alive=" + alive +
        '}';
  }
}
