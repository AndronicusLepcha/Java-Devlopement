// create thread 
class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        {
           System.out.println("Robot");
           try{Thread.sleep(1000);}catch(Exception e){};
        }
    } 
}
class Thread2 extends Thread{
   public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hacked");
            try{Thread.sleep(1000);}catch(Exception e){};
        }
    } 
}

public class Main { // By default main is the thread
    public static void main(String[] args) {
         Thread1 o1 =new Thread1();
         Thread2 o2 = new Thread2();
         o1.start();
         o2.start();
    }
}
