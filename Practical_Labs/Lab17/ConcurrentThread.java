/**
 * Lab 17: Concurrent Task Execution Mechanics
 * Purpose: Spawn parallel threads to alternate computing operations across numeric data spaces.
 * Author: Ahmad Ali
 */

// Thread implementation by extending the Thread Base Class
class OddNumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

// Thread implementation by implementing the Runnable Interface
class EvenNumberRunnable implements Runnable {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

public class ConcurrentThread {
    public static void main(String[] args) {
        // Instantiate thread worker components 
        OddNumberThread oddThread = new OddNumberThread();
        
        Thread evenThread = new Thread(new EvenNumberRunnable());

        // Kick off asynchronous task scheduling pipelines
        System.out.println("--- Booting Concurrent Threads Engine ---");
        oddThread.start();
        evenThread.start();
    }
}