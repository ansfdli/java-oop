class Manager extends Employee{

  String company;

  // constructor
  Manager(String name){
    super(name);
  }


  // constructor overloading
  Manager(String name, String company){
    super(name);
    this.company = company;
  }

  void sayHello(String name){
    System.out.println("Hello " +name + ", My Name is Manager " + this.name);
  }
}
