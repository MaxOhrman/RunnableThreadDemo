package ohrman.max;

public class SubclassDemo extends Thread {

    /*
    This Demo showcases how to implement multithreading
    by extending Thread
     */

    //Override run from the Runnable interface in order to implement the desired functionality
    @Override
    public void run() {

        for(int i = 10; i>0; i--) {
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
