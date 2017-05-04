package strategy;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Consumer wants to consume
 Consumer consumed "Thu May 04 12:26:26 BST 2017"
 Consumer wants to consume
 Consumer consumed "Thu May 04 12:26:26 BST 2017"
 Consumer wants to consume
 Consumer consumed "Thu May 04 12:26:26 BST 2017"
 Consumer wants to consume
 Consumer consumed "Thu May 04 12:26:26 BST 2017"
 Consumer wants to consume
 Producer produced "Thu May 04 12:26:26 BST 2017"
 Producer produced "Thu May 04 12:26:26 BST 2017"
 Producer produced "Thu May 04 12:26:26 BST 2017"
 Producer produced "Thu May 04 12:26:26 BST 2017"
 *
 */


public class BoundedBuffer2 {

    public static void main(String args[]) {
        //instantiate (create) buffer shared by Producer & Consumer
        BoundedBuffer sharedBuffer = new BoundedBuffer(5);
        // create the producer and consumer threads
        Thread producerThread = new Thread(new Producer(sharedBuffer));
        Thread consumerThread = new Thread(new Consumer(sharedBuffer));
        //start() method allocates memory for a new thread in the JVM,
        //and calls the run() method
        producerThread.start();
        consumerThread.start();
    }
}

    class BoundedBuffer {
        private final String[] buffer;
        private final int capacity;

        private int front;
        private int rear;
        private int count;

        private final Lock lock = new ReentrantLock();

        private final Condition notFull = lock.newCondition();
        private final Condition notEmpty = lock.newCondition();

        public BoundedBuffer(int capacity) {

            this.capacity = capacity;

            buffer = new String[capacity];
        }

        public void deposit(String data) throws InterruptedException {
            lock.lock();

            try {
                while (count == capacity) {
                    notFull.await();
                }

                buffer[rear] = data;
                rear = (rear + 1) % capacity;
                count++;

                notEmpty.signal();
            } finally {
                lock.unlock();
            }
        }

        public String fetch() throws InterruptedException {
            lock.lock();

            try {
                while (count == 0) {
                    notEmpty.await();
                }

                String result = buffer[front];
                front = (front + 1) % capacity;
                count--;

                notFull.signal();

                return result;
            } finally {
                lock.unlock();
            }


        }

    }

class Producer implements Runnable {

    private BoundedBuffer buffer;

    public Producer(BoundedBuffer b) {
        buffer = b;
    }

    public void run() {
        Date message;
        while (true) {

            // produce an item & enter it into the buffer
            message = new Date();
            System.out.println("Producer produced \"" + message + "\"");
            try {
                buffer.deposit(message.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




//*******************************************************

        /**
         * This is the consumer thread for the bounded buffer problem.
         */

        class Consumer implements Runnable {

            private BoundedBuffer buffer;

            public Consumer(BoundedBuffer b) {
                buffer = b;
            }

            public void run() {
                while (true) {

                    // consume an item from the buffer
                    System.out.println("Consumer wants to consume");
                    try {
                        String message = buffer.fetch();
                        System.out.println("Consumer consumed \"" + message + "\"");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        
        
        
        




