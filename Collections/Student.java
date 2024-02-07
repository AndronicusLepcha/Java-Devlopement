public class Student implements Comparable<Student>{
    public int reg;
    public String name;
    public int age;

    Student(int reg,String name,int age){
            this.reg=reg;
            this.name=name;
            this.age=age;
    }

    public int getReg() {
        return reg;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [reg=" + reg + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student arg0) {
        return this.age - arg0.age;
    }
}
