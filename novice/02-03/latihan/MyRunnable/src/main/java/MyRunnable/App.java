/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyRunnable;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // We will store the threads so that we can check if they are done
        List<Thread> threads = new ArrayList<Thread>();

        // We will create 500 threads
        for (int i = 0; i < 500; i++) {
            Runnable task = new MyRunnable(10000000L + i);
            Thread worker = new Thread(task);
        }
    }
}
