import java.util.TreeSet;

public class DemoTree {
    public static void main(String[] args) {
        TreeSet<Product> ts =new TreeSet<Product>();
        ts.add(new Product("Laptop",122,50000));
        ts.add(new Product("Camera",192,90000));
        ts.add(new Product("Mic",102,8900));
// For more Description about the treeset go to product.java line 32
        for (Product product : ts) {
            System.out.println(product);
        }
    }
}
