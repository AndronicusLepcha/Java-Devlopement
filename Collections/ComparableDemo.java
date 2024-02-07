import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args){

        // ArrayList of an Student
        List<Student> st=new ArrayList<>();
        st.add(new Student(12,"Andro",21));
        st.add(new Student(13,"Robot",24));
        st.add(new Student(11,"Binita",23));
        st.add(new Student(9,"Mehersa",16));
        st.add(new Student(15,"Arpan",21));

        System.out.println(" *****Student data sorting based on age #that is overriden in the Employee class itself****");
        Collections.sort(st);

        for(Student s : st){
            System.out.println(s);
        }
    }
}

