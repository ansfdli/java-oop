package testing.oop.app;

public class EqualsApp {
  public static void main(String[] args) {

    String first = "Riko";
    first = first + " " + "Joki";

    System.out.println(first);

    String second = "Riko Joki";
    System.out.println(second);

    // Equals Method, membandingkan isi konten dari objek
    System.out.println(first == second); // false
    System.out.println(first.equals(second)); // true
  }
}
