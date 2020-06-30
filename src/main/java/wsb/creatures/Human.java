package wsb.creatures;

import java.util.Arrays;
import java.util.Comparator;
import wsb.devices.carphone.Car;
import wsb.devices.carphone.Phone;

public class Human extends Animal {
  public String firstName;
  public String lastName;
  public Animal pet;
  public Phone mobile;
  private Car[] cars = new Car[0];
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

  public Car[] getCars() {
    return cars;
  }

  public void setCars(Car[] cars) {
    if(salary>cars[0].price){
      System.out.println("the car is being bought");
      this.cars = cars;
    }
    else if (salary > cars[0].price / 12) {
      System.out.println("the car has been bought by card");
      this.cars = cars;
    } else {
      System.out.println("Go to school and find a better job in order to afford this car");
    }
  }

  @Override
  public String toString() {
    return "Human{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", pet=" + pet +
        ", mobile=" + mobile +
        ", cars=" + Arrays.toString(cars) +
        ", cash=" + cash +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", salary=" + salary +
        ", species='" + species + '\'' +
        ", name='" + name + '\'' +
        ", pic=" + pic +
        '}';
  }
}

