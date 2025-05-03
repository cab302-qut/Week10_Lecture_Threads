package ExtendThread;

public class NewThread extends Thread {


    public NewThread() {
        super("Demo Thread");

        System.out.println("Child Thread - Thread ID = " + this.threadId());
    }


    @Override
    public void run() {
        try {
            for (int i=5; i > 0; i--) {
                System.out.println("Child thread -= Thread ID = " + super.threadId() + " - loop invariant = " + i + "\n");
                Thread.sleep(500);
            }           } catch (InterruptedException ex) {
            System.out.println("Exception -= " + ex.getMessage());
        }
        System.out.println("Child exiting - ID = " + super.threadId() + "\n");
    }
}