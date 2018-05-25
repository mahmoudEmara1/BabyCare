package threadrunable;

class Runner implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + "value: " + i);
        }
        System.out.println("thread name : " + Thread.currentThread().getName());
        System.out.println("thread state : " + Thread.currentThread().getState());
        System.out.println("thread priority : " + Thread.currentThread().getPriority());

        try {
            Thread.sleep(100);

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}

public class app {

    public static void main(String[] args) {
                   int volatile  c=5;


        Thread thread1 = new Thread(new Runner());
       thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
       // Thread thread2 = new Thread(new Runner());
        // thread2.start();

    }

}
