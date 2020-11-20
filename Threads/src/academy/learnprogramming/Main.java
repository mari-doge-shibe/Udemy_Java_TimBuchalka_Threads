package academy.learnprogramming;

import static academy.learnprogramming.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
//        anotherThread.start();
        anotherThread.run();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
//                super.run();
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation");
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread."); // if no color is specified, the last color is printed
    }
}
