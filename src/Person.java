class Person {
  String name; // field
  String address; // field
  String age; // field
  final String country = "Indonesia"; // field

  // Constructor
  Person(String paramName, String paramAddress){
    name = paramName;
    address = paramAddress;
  }

  // Constructor Overloading
  Person(String paramName){
    // name = paramName;
    this(paramName, null);
  }

  Person(){
  }

  // Constructor, solving variable shadowing with "this" Keyword
  Person(String name, String address, String age){
    this.name = name;
    this.address = address;
    this.age = age;
  }

  // Method 1
  void sayHello(String paramName){
    System.out.println("Hello " + paramName + ", My Name is " + name + " " + this.age);
  }
}
