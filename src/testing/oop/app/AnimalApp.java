package testing.oop.app;

import testing.oop.data.Animal;
import testing.oop.data.Kucing;

public class AnimalApp {
  public static void main(String[] args) {

    Animal animal = new Kucing();
    animal.name = "Ciku";
    animal.run();
  }
}
