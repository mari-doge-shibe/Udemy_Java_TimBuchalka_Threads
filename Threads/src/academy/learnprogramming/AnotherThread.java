package academy.learnprogramming;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from another thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();
    }
}