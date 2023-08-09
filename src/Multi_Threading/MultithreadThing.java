package Multi_Threading;

public class MultithreadThing extends Thread {

    public MultithreadThing() {}

    public MultithreadThing(String name) {
        super(name);
    }


    //Override the Thread run() method
    //When we start() the instance of this Thread class, it's going to execute this function
    //This will be the code to execute for this thread (this specific thread)
    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println(Thread.currentThread() + ": " + i);
            //Perform the pause after each iteration
            try {
                Thread.sleep(1000);  //pause for 1000ms, or 1s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #1 is finished!");
    }
}
