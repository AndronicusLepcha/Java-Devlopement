import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        System.out.println("After Sorting  based on the logic "+ls);

        // ArrayList of an Student
        List<Student> st=new ArrayList<>();
        st.add(new Student(12,"Andro",21));
        st.add(new Student(13,"Robot",24));
        st.add(new Student(11,"Binita",23));
        st.add(new Student(9,"Mehersa",16));
        st.add(new Student(15,"Arpan",21));

        // Comparator for student using anonymous class
        Comparator<Student> srt = new Comparator<Student>() {
            public int compare(Student a,Student b){
                if(a.reg>b.reg)
                    return 1;
                else
                return -1;
            }
        };

        System.out.println("Student data "+st);
        Collections.sort(st);
        for(Student s : st){
            System.out.println(s);
        }



      
    }
}
