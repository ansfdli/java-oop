public class PolymorphismApp {
  public static void main(String[] args) {

    Employee employee = new Employee("Andi");
    employee.sayHello("Joni");

    employee = new Manager("Kiki"); // polymorphism
    employee.sayHello("Budi");

    employee = new VicePresident("Dodi"); // polymorphism
    employee.sayHello("Budi");

    sayHello(new Employee("Dedi ")); // method polymorphism
    sayHello(new Manager("Heri ")); // method polymorphism
    sayHello(new VicePresident("Lele ")); // method polymorphism
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {  // Type Check & Casts
      VicePresident vicePresident = (VicePresident) employee; // conversion
      System.out.println("Hello VP " + vicePresident.name);
    }else if (employee instanceof Manager) { // Type Check & Casts
      Manager manager = (Manager) employee; // conversion
      System.out.printf("Hello Manager " + manager.name);
    }else {
      System.out.printf("Hello " + employee.name);
    }

  }
}
