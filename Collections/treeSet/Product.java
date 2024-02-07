public class Product implements Comparable<Product>{
    String name;
    int pId;
    int price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getpId() {
        return pId;
    }
    public void setpId(int pId) {
        this.pId = pId;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Product(String name, int pId, int price) {
        this.name = name;
        this.pId = pId;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", pId=" + pId + ", price=" + price + "]";
    }
    // This is necessary in TreeSet as it has a natural ordering behaviour so
    // if this comparable is not implemented then the set will throw an class cast exception 
    //which is because that the set get confused like which parameter to use to sort the object 
    // if the tree set has other data like an list only then we dont need to implement the comparable
    // as it can directly sort the list 
    @Override
    public int compareTo(Product o) {
        // TODO Auto-generated method stub
        return this.pId - o.pId;
    }
    
    
}
