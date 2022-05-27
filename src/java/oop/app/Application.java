package java.oop.app;

import java.oop.data.Product;
import java.oop.data.Data;
//import java.oop.data.*; // import semua package di folder (data) pakai tanda *

public class Application {
  public static void main(String[] args) {

    Product product = new Product("laptop", 320);
    System.out.println(product.name);
    System.out.println(product.price);

    Data data = new Data();
  }
}
