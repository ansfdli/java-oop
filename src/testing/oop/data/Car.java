package testing.oop.data;

public interface Car extends HasBrand {
  void drive();

  int getTire();

  default boolean isBig(){ // default method
    return false;
  }
}
