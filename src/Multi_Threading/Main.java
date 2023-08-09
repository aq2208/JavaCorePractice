package Multi_Threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main()");

        //Create a thread by extends Thread class
        MultithreadThing thread1 = new MultithreadThing();

        //Create a thread with name
        MultithreadThing threadWithName = new MultithreadThing("AnhQuanThread");
        System.out.println("threadWithName's state now: " + threadWithName.getState());

        //Create a thread by implements Runnable interface
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //Start the threads
        threadWithName.start();
        System.out.println("threadWithName's state now: " + threadWithName.getState());
        System.out.println("threadWithName's name now: " + threadWithName.getName());
//        thread1.join();
        thread2.start();

        System.out.println("Exit main()");
    }
}
