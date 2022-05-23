class Manager {

  String name;
  String company;

  // constructor
  Manager(String name){
    this.name = name;
  }


  // constructor overloading
  Manager(String name, String company){
    this.name = name;
    this.company = company;
  }

  void sayHello(String name){
    System.out.println("Hello " +name + ", My Name is Manager " + this.name);
  }
}
