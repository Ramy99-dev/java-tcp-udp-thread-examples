
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread1();
        Thread th2 = new Thread2();

        

        th1.start();
        th2.start();
        //Main thread will wait until thread 1 & 2 completes 
        th1.join();
        th2.join();
      
        
        System.out.println("main thread completed");

        

        
    }
    
}
