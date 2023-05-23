
public class Main {

    public static int x = 0;

    public static  synchronized void increment()
    {
        for(int i = 0 ; i < 10 ; i++)
        {
            x++;
            System.out.println(x);
        }
      

    }

    public static void main(String[] args) {
        
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();


    }
    
}
