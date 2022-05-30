package testing.oop.data;

public class Alphard implements Car, IsMaintanance {


  public void drive() {
    System.out.println("Alphard drive");
  }

  public int getTire() {
  return 4;
  }

  public String getBrand() {
    return "Toyota";
  }

  public boolean isMaintanance() {
    return false;
  }
}
