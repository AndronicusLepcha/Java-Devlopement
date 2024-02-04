// Generic Class
// T-> Type
// U->Unkown Type
// M-> Method

class GenericExample<T>{
    T x; // unknown data type
    public void display(T x){
        System.out.println("Value of x is : "+x);
    }
}

// Generic Pair
class GenericPair<T,U>{
    T a;
    U b;
    public void show(T a, U b){
        this.a=a;
        this.b=b;
        System.out.println("Data Received are "+a+" and "+b);
    }
}


class GenericClass{
    public static void main(String args[]){
        //Calling generic class
        GenericExample<String> obj = new GenericExample();
        obj.display("Anonymous");

        GenericPair<String,Integer> obj1 = new GenericPair();
        obj1.show("Robot",999999);
    }
}