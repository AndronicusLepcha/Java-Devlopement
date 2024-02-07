import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// This class will implements the Comparator which is one of the way to use comparator
// This is basically done for the ease of user to set there own logic for the comparision purpose
class sortStudent implements Comparator<Student>{

    @Override
    public int compare(Student arg0, Student arg1) {
        return arg0.getReg() - arg1.getReg();
    }

}

public class ComparatorDemo {
    public static void main(String[] args) {

          //Comprator is an interface so we have 3 diffrent multiple ways to implement
        //1. by implementing in class
        //2. by creating anonymous class
        //3. lambda fun 
        Comparator<Integer> com  = new Comparator<Integer>(){ // this is anonymous class implementation
            public int compare(Integer a,Integer b){
                if(a%10 > b%10)
                    return 1; // It means swap
                else
                    return -1;
            }
        };

        List<Integer> ls = new ArrayList<>();
        ls.add(45);
        ls.add(56);
        ls.add(90);
        ls.add(59);
        System.out.println("Before Sorting "+ls);
        Collections.sort(ls); // It sort based on 
        System.out.println("After Sorting "+ls);
        Collections.sort(ls,com);
        //Now sort the ArrayList base on the last int value 
        //we can use the concept of Comparator
        //System.out.println("After Sorting  based on the logic "+ls);

        // ArrayList of an Student
        List<Student> st=new ArrayList<>();
        st.add(new Student(12,"Andro",21));
        st.add(new Student(13,"Robot",24));
        st.add(new Student(11,"Binita",23));
        st.add(new Student(9,"Mehersa",16));
        st.add(new Student(15,"Arpan",21));

        // Comparator for student using lambda
        Comparator<Student> srt = (i,j)->i.age > j.age?1:-1;

        System.out.println(" *****Student data sorting based on age****");
        Collections.sort(st,srt);

        for(Student s : st){
            System.out.println(s);
        }
        System.out.println(" *****Student data sorting based on Reg no****");
        Collections.sort(st,new sortStudent());

        for(Student s : st){
            System.out.println(s);
        }
    }
}
