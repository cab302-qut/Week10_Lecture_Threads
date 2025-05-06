package ExtendThread;
/*
Thread Implementation
 */

public class ExtendThread {

        public static void main(String[] args) {

           NewThread nt = new NewThread();
            nt.start();
            try {
                for (int i=5; i > 0; i--) {
                    System.out.println("Main thread " + nt.threadId() + " -- loop invariant = " + i + "\n");
                    Thread.sleep(500);
                }
            } catch (InterruptedException ex) {
                System.out.println("Exception -= " + ex.getMessage());
            }
            System.out.println("MAIN THREAD EXITING" + "\n");
        }

    }

