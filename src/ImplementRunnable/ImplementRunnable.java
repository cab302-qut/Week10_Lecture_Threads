package ImplementRunnable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            NewThread nt = new NewThread();
            nt.myThread.start();
            try {
                for (int i=5; i > 0; i--) {
                    System.out.println("ImplementRunnable.Main thread -- loop invariant = " + i + "\n");
                    Thread.sleep(500);
                }
            } catch (InterruptedException ex) {
                System.out.println("Exception -= " + ex.getMessage());
            }
            System.out.println("MAIN THREAD EXITING" + "\n");
        }

    }
