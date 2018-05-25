package threading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Threading extends Thread {
    

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + "value: " + i);
        }
        try {
            Thread.sleep(1000);
            Thread.yield();
        } catch (InterruptedException ex) {
            Logger.getLogger(Threading.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        for(int i =1 ;i<10 ;i++){
            System.out.println("Thread main is runnig");
        }
        Threading t = new Threading();
        Threading t1 = new Threading();
        t.setPriority(MAX_PRIORITY);
        t.start();
        t1.start();
        t.getState();

    }

}
