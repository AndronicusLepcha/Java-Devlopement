class Demo{
    String name;
    int age;
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Demo [name=" + name + ", age=" + age + "]";
    }
    
}
class Classes_Objects{
    public static void main(String[] args) {
        Demo obj=new Demo("Robot", 23);
        System.out.println(obj);
    }
}