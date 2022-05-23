public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Juju", "Pacitan");  // Object1
     // person1.name = "Juju";
     // person1.address = "Pacitan";
     // person1.country = "Russia"; // ERROR


    Person person2 = new Person("Gogon", "Bantul"); // Object2
    Person person3;
    person3 = new Person("Nopek", "Madiun"); // Object3
    Person person4 = new Person(); // object 4 (null)
    Person person5;
    person5 = new Person();
    person5.name = "Budi"; // object 5

    // System.out.println(person1.name);
    // System.out.println(person1.address);
    // System.out.println(person1.country);

    person1.sayHello("Kiku");
    person2.sayHello("");
    person3.sayHello("Lili");
    person4.sayHello("Boni"); // object 4 (null)
    person5.sayHello("Joni");
  }
}
