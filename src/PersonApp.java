public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Juju", "Pacitan");  // Object1
//    person1.name = "Juju";
//    person1.address = "Pacitan";
    // person1.country = "Russia"; // ERROR


    Person person2 = new Person("Gogon", "Bantul"); // Object2
    Person person3; // Object3
    person3 = new Person("Nopek", "Madiun");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Kiku");
    person3.sayHello("Lili"); // object 3 (null)
  }
}
