import java.util.*;

// Implementing the Comparator
class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student arg0, Student arg1) {
        return arg0.getName().compareTo(arg1.getName());
    }
    
}

public class Main {
    public static void main(String[] args) {
        // ArrayList of Type Object
        List<Student> obj = new ArrayList<Student>();
        obj.add(new Student(11,"Andronicus",21));
        obj.add(new Student(23,"Babita",22));
        obj.add(new Student(13,"Anita",21));
        obj.add(new Student(4,"Mehersha",23));

        // print the details if the list Student
        System.out.println(obj);

        // Print in more dynamic way
        System.out.println("Array List Data Unsorted");
        for (Student student : obj) {
            System.out.println(student);
        }
        // sort the object by the reg no
        // Collections.sort(obj); now we cannot use this here 
        // we need to impelement the comparable or the comparator
        System.out.println("Array List Data sorted");
        Collections.sort(obj,new SortByName());

        for (Student student : obj) {
            System.out.println(student);
        }

    }

}
