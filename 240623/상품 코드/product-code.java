import java.util.Scanner;

class Product {
  String name;
  int code;

  public Product() {
    name = "codetree";
    code = 50;
  }

  public Product(String name, int code) {
    this.name = name;
    this.code = code;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name = sc.next();
    int code = sc.nextInt();

    Product product1 = new Product();
    Product product2 = new Product(name, code);

    printInfo(product1);
    printInfo(product2);

    sc.close();
  }

  public static void printInfo(Product product) {
    System.out.printf("product %d is %s\n", product.code, product.name);
  }
}