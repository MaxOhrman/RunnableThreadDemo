package ohrman.max;


public class Main {

    public static void main(String[] args) {

        /*
        SubclassDemo is of type Thread, we start it using
        Threads method start()

        The Thread class implements Runnable so in this case
        it is not necessary
         */
        SubclassDemo thread = new SubclassDemo();
        thread.start();

        /*
        Creating an instance of RunnableDemo(which implements Runnable)
        parsing it to the Thread constructor, and then we start
        the thread using the method start()

        In Java, you can only extend one object.
        This way we can still extend something if needed.
         */
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread2 = new Thread(runnableDemo);
        thread2.start();


        /*
        - Both Threads run at the same time
        - If on Thread encounters an exception the other threads will still run independently
         */

        //The Main class also run on its own thread.
        System.out.println("Name of the main thread: " + Thread.currentThread().getName());

    }
}
