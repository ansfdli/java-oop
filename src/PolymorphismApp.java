public class PolymorphismApp {
  public static void main(String[] args) {

    Employee employee = new Employee("Andi");
    employee.sayHello("Joni");

    employee = new Manager("Kiki");
    employee.sayHello("Budi");

    employee = new VicePresident("Dodi");
    employee.sayHello("Budi");

    sayHello(new Employee("Dadu1"));
    sayHello(new Manager("Dadu2"));
    sayHello(new VicePresident("Dadu3"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + vicePresident.name);
    }else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.printf("Hello Manager " + manager.name);
    }else {
      System.out.printf("Hello " + employee.name);
    }

  }
}
