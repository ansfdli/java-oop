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

  static void sayHello(Employee employee){
    System.out.println("Hello " + employee.name);
  }
}
