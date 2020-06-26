package wsb;

import java.util.Arrays;
import wsb.creatures.Animal;
import wsb.creatures.Human;
import wsb.database.Connector;
import wsb.devices.Car;
import wsb.devices.Diesel;
import wsb.devices.ElectricCar;
import wsb.devices.Phone;

public class Main {

  public static void main(String[] args) throws Exception {
    Human anna = new Human();
    anna.setTransaction(200.30);

  }

  private static void fourthMain() {

    Car diesel = new Diesel("BMW", "runner", 2019, 30.30);
    Car electricCar = new ElectricCar("Tesla", "brilliant", 2020, 66.25);

    diesel.refuel();
    electricCar.refuel();

  }

  private static void thirdMain() {
    Animal dog = new Animal("german shepherd");
    Human gordo = new Human();
    gordo.name = "Victor";
    gordo.feed();
    dog.feed("purina");

  }

  private static void secondTask() {
    Human seller = new Human();
    Human gordo = new Human();
    gordo.firstName = "Victor";
    double price = 10;

    Car mercedes = new Diesel("mercedes", "no se", 2020, 120.0);
    Car optra = new Diesel("chevrolet", "bonito", 2003, 105.0);
    Car aveo = new ElectricCar("tesla", "the best", 2019, 130.0);
    seller.cars = new Car[] {mercedes, optra, aveo};

    System.out.println(gordo + " has " + gordo.cars.length + " cars");
    mercedes.sell(gordo, seller, price);

    System.out.println(gordo + " has " + gordo.cars.length + " cars");
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

    Human tony = new Human();
    gordo.firstName = "Anthony";
    gordo.lastName = "Miller";
    gordo.pet = dog;
    gordo.mobile = iphone;


    me.pet.feed();
    me.pet.takeForAWalk();
    me.pet.feed();
    me.pet.takeForAWalk();
    me.pet.takeForAWalk();
    me.pet.takeForAWalk();
    me.pet.takeForAWalk();


    System.out.println("It is the same car " + (me.cars == gordo.cars));

    Car dirtyOne = new Diesel("fiat", "bravo", 2014, 1.6);
    dirtyOne.plates = "GDA2314";
    me.cars[2] = dirtyOne;
    System.out.println(me.cars[2].producer + " " + me.cars[2].model + " " + me.cars[2].plates);

    System.out.println("This is my first car" + me.cars[1]);
    System.out.println(me instanceof Human);
    System.out.println(me instanceof Object);

    me.feed();
    me.pet.feed();

    iphone.turnOn();
    dirtyOne.turnOn();



    System.out.println("test");


    String[] names = {"Fabiana", "Victor", "Elto"};
    Integer[] number = {2314, 3212, -2212};

    for (int i = 0; i < names.length; i++) {

    }
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));

    Arrays.sort(number);
    System.out.println(Arrays.toString(number));

  }
}
