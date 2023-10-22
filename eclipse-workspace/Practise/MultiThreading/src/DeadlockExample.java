public class DeadlockExample {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 1 acquired lock 1");
                    try {
                        Thread.sleep(100);  // Simulate some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 1 is waiting for lock 2");
                    synchronized (lock2) {
                        System.out.println("Thread 1 acquired lock 2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 2 acquired lock 1");
                    try {
                        Thread.sleep(100);  // Simulate some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 2 is waiting for lock 2");
                    synchronized (lock2) {
                        System.out.println("Thread 2 acquired lock 2");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished");
    }
}
