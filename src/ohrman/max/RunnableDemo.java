package ohrman.max;

public class RunnableDemo implements Runnable {

    /*
    In this demo we showcase how to implementing
    multithreading by implementing the Runnable interface
     */

    //Override run from the Runnable interface in order to implement the desired functionality
    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " is finished.");
    }

}
