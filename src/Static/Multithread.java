package Static;

public class Multithread {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Creating multiple threads that modify the same StringBuffer
        Thread t1 = new Thread(() -> {
            synchronized (sb) {
                for (int i = 0; i < 5; i++) {
                    sb.append(" A");
                    System.out.println("Thread 1: " + sb);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (sb) {
                for (int i = 0; i < 5; i++) {
                    sb.append(" B");
                    System.out.println("Thread 2: " + sb);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
