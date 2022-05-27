package testing.oop.app;

import testing.oop.data.City;
// import java.oop.data.Location;

public class LocationApp {
  public static void main(String[] args) {

    // var Location = new Location(); error karena abstract class
    var city = new City();
    city.name = "Jakarta";

    System.out.println(city.name);
  }
}
