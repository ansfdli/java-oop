public class ParentApp {
  public static void main(String[] args) {

    Child child = new Child();
    child.name = "Edi";
    child.doIt();
    System.out.printf(child.name);

    Parent parent = child; // conversion
    parent.name = "Surti";
    parent.doIt();
    System.out.println(parent.name);
  }
}
