

public class Thread1 extends Thread {

    @Override
    public void run() {
        super.run();

        execute();
    }

    public void execute()
    {
        for(int i = 0;  i < 10 ; i++)
        {
            System.out.println("Executing thread 1 ...");
        }
    }
    

}