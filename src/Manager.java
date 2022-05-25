class Manager extends Employee{

  String company;

  // constructor
  Manager(String name){
    super(name); // super constructor ke parent "Employee"
  }


  // constructor overloading
  Manager(String name, String company){
    super(name); // super constructor ke parent "Employee"
    this.company = company;
  }

  void sayHello(String name){
    System.out.println("Hello " +name + ", My Name is Manager " + this.name);
  }
}
