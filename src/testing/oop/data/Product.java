package testing.oop.data;

public class Product {

  public String name;
  public int price;

  public Product(String name, int price){
    this.name = name;
    this.price = price;
  }

  // toString Method
  public String toString(){
    return "Product name: " + name + ", price: " + price;
  }
}
