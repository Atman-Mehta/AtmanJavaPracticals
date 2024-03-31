// Write a Java program to illustrate creation of threads.

package JavaPracticals;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
    }
}

public class Prac12 {
    public static void main(String[] args) {
        int numThreads = 5;
        
        // Create and start multiple threads
        for (int i = 0; i < numThreads; i++) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}

