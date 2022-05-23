public class ManagerApp {
  public static void main(String[] args) {

    var manager = new Manager();
    manager.name = "Kiki";
    manager.sayHello("Andi");


    // child class
    var vp = new VicePresident();
    vp.name = "Lila";
    vp.sayHello("Doni");
  }
}
