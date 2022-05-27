package testing.oop.app;

import testing.oop.data.Product;
import testing.oop.data.Data;
//import java.oop.data.*; // import semua package di folder (data) pakai tanda *

public class Application {
  public static void main(String[] args) {

    Product product = new Product("laptop", 320);
    System.out.println(product.name);
    System.out.println(product.price);

    Data data = new Data();
  }
}
