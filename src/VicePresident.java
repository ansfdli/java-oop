class VicePresident extends Manager {

  // method overriding
  void sayHello(String name){
    System.out.println("Hello " +name + ", My Name is VP " + this.name);
  }
}
