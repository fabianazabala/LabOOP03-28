package wsb;

import java.util.Arrays;
import wsb.creatures.Animal;
import wsb.creatures.Human;
import wsb.devices.Car;
import wsb.devices.Diesel;
import wsb.devices.ElectricCar;
import wsb.devices.Phone;

public class Main {

  public static void main(String[] args) throws Exception {
    fourthMain();
  }

  private static void fourthMain() {

    Car diesel = new Diesel("BMW", "runner", 2019, 30.30);
    Car electricCar = new ElectricCar("Tesla", "brilliant", 2020, 66.25);

    diesel.refuel();
    electricCar.refuel();

  }
  private static void thirdMain() {
    Animal dog = new Animal("pug");
    Human gordo = new Human();
    gordo.name = "Victor";
    gordo.feed();
    dog.feed("karma");

  }

  private static void secondMain() {
    Human buyer = new Human();
    Human seller = new Human();
    double price = 10;

    Car mercedes = new Diesel("mercedes", "no se", 2020, 120.0);

    mercedes.sell(buyer, seller, price);
  }

  private static void firstMain() throws Exception {
    Animal dog = new Animal("dog");
    dog.name = "Pepe";

    Phone iphone = new Phone("Apple", "6s", 4.7);
    Phone motorola = new Phone("Motorola", "G6", 2.22);


    Human me = new Human();
    me.firstName = "Fabiana";
    me.lastName = "Zabala";
    me.pet = dog;
    me.mobile = iphone;

    Human gordo = new Human();
    gordo.firstName = "Victor";
    gordo.lastName = "Mars";
    gordo.pet = dog;
    gordo.mobile = motorola;

    System.out.println("It is the same car " + (me.car == gordo.car));


    me.pet.feed();
    me.pet.takeForAWalk();
    me.pet.feed();
    me.pet.takeForAWalk();
    me.pet.takeForAWalk();
    me.pet.takeForAWalk();
    me.pet.takeForAWalk();

    Car dirtyOne = new Diesel("fiat", "bravo", 2014, 1.6);
    dirtyOne.plates = "GDA2314";
    me.car = dirtyOne;
    System.out.println(me.car.producer + " " + me.car.model + " " + me.car.plates);

    System.out.println(me instanceof Animal);
    System.out.println(me instanceof Human);
    System.out.println(me instanceof Object);

    me.feed();
    me.pet.feed();

    iphone.turnOn();
    dirtyOne.turnOn();


    System.out.println("test");


   String[] names = {"Fabiana", "Victor", "Elto"};
   Integer[] number = {2314, 3212, -2212};

   for(int i = 0; i<names.length; i++){

   }
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));

    Arrays.sort(number);
    System.out.println(Arrays.toString(number));

  }
}
