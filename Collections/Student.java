public class Student{
    public int reg;
    public String name;
    public int age;

    Student(int reg,String name,int age){
            this.reg=reg;
            this.name=name;
            this.age=age;
    }

    @Override
    public String toString() {
        return "Student [reg=" + reg + ", name=" + name + ", age=" + age + "]";
    }

    // @Override
    // public int compareTo(Student that) {
    //     if(this.reg>that.reg)
    //                 return 1;
    //             else
    //             return -1;
        
    // }
    
    
}
