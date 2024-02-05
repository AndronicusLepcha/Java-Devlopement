import java.util.*;
class ArrayListDemo{
    public static void main(String args[]){
        List<Number> lst = new ArrayList(); // This is late binding
        //ArrayList lst = new ArrayList(); // This is early bindind
        lst.add(90);
        lst.add(99);
        System.out.println(lst);

        // Printing arraylist
        Iterator itr = lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Generic List
        List<Integer> lt=new ArrayList<Integer>();
        lt.add(400);
        lt.add(78);
        System.out.println("Before Sorting "+lt); // Before Sorting
        Collections.sort(lt);
        System.out.println("After Sorting "+lt);
        }
}