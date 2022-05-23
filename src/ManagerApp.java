public class ManagerApp {
  public static void main(String[] args) {

    var manager = new Manager("Kiki");
    // manager.name = "Kiki";
    manager.sayHello("Andi");


    // child class
    var vp = new VicePresident("Lila");
    // vp.name = "Lila";
    vp.sayHello("Doni");
  }
}
