package wsb.creatures;

import java.util.Arrays;
import java.util.Comparator;
import wsb.devices.Car;
import wsb.devices.Phone;

public class Human extends Animal {
  public String firstName;
  public String lastName;
  public Animal pet;
  public Phone mobile;
  public Car[] cars = new Car[0];
  public Double cash = 100.0;

  protected String phoneNumber;

  private Double salary;

  public Human() {

    super("homo-sapiens");
  }

  public Double getSalary() {

    return salary;
  }

  public void setTransaction(Double salary) {
    if (salary < 0) {
      System.out.println("This is not possible");
    }
    System.out.println("New data has been sent to account system");
    System.out.println("If you need any help, please contact Ms. Joanna from the front office");
    System.out.println("Public Health Insurance Tax Office has to know about this salary change");
    this.salary = salary;
  }

  public void sell(Human buyer, Human seller, double price) throws Exception {
    throw new Exception("don't do this freak");
  }

  public void eat() throws Exception {
    throw new Exception("don't do this freak");
  }

  public String toString() {

    return firstName;
  }

  public void feed(String food) {
    System.out.println("Thanks for " + food);
  }

  public double sumValueOfCars() {
    double result = 0.0;
    for (int i = 0; i <= cars.length; i++) {
      result += cars[i].price;
    }
    return result;
  }

  public Car[] sortCarsByYearOfProduction() {
    Arrays.sort(cars, Comparator.comparing(car1 -> car1.yearOfProduction));
    return cars;
  }

}

