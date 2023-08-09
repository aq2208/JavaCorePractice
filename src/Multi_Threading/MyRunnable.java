package Multi_Threading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread #2: " + i);
            //Perform the pause after each iteration
            try {
                Thread.sleep(1000);  //pause for 1000ms, or 1s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #2 is finished!");
    }
}
