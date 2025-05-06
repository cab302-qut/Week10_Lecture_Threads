package ImplementRunnable;
/*
Runnable Interface
 */

public class NewThread implements Runnable{

    Thread myThread;

    public NewThread() {
        myThread = new Thread(this, "Demo Thread");
        System.out.println("Child Thread - Thread ID = " + myThread.threadId());
    }

    public Thread getThread() {
        return myThread;
    }
    @Override
    public void run() {
        try {
            for (int i=5; i > 0; i--) {
                System.out.println("Child thread -= Thread ID = " + myThread.threadId() + " - loop invariant = " + i + "\n");
                Thread.sleep(500);
}           } catch (InterruptedException ex) {
                System.out.println("Exception -= " + ex.getMessage());
            }
        System.out.println("Child exiting - ID = " + myThread.threadId() + "\n");
    }
}
