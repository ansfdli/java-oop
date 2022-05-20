class Person {
  String name;
  String address;
  final String country = "Indonesia";

  // Method 1
  void sayHello(String paramName){
    System.out.println("Hello " + paramName + ", My Name is " + name);
  }
}
