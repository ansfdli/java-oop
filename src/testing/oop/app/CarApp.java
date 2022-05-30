package testing.oop.app;

import testing.oop.data.Alphard;
import testing.oop.data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Alphard();
    System.out.println(car.getTire());
    car.drive();
    System.out.println(car.getBrand());
  }
}
