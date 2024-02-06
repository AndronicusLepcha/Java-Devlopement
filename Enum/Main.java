enum Size{ // we can declare enum outside the class 
    SMALL,MEDIUM,LARGE,EXTRALARGE
}
public class Main {
    enum Gender{MALE,FEMALE}

    public static void main(String[] args) {
        Size pizzaSize; // Datatype to store enum is itself the enum var
        pizzaSize = Size.EXTRALARGE; // this is how we can access the value of enum
        switch(pizzaSize){
            case EXTRALARGE:
            System.out.println("You have ordered Extra Large Pizza");
            break;
            case LARGE:
            System.out.println("You have ordered Large Pizza");
            break;
            case MEDIUM:
            System.out.println("You have ordered Medium Pizza");
            break;
            case SMALL:
            System.out.println("You have ordered Small Pizza");
            break;
        }

        //print ordinal value
        System.out.println(Size.valueOf("EXTRALARGE").ordinal());
    }
}
