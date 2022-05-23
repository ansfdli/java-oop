class VicePresident extends Manager {

  // super constructor
  VicePresident(String name){
    super(name);
  }

  // method overriding
  void sayHello(String name){
    System.out.println("Hello " +name + ", My Name is VP " + this.name);
  }
}
