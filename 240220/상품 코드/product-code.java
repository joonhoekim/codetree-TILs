import java.util.Scanner;

class Product {
    String name;
    int code;

    Product(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void print() {
        System.out.printf("product %d is %s\n", code, name);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        
        Product p1 = new Product("codetree", 50);
        Product p2 = new Product(sc.next(), sc.nextInt());

        p1.print();
        p2.print();

    }
}