package Thread;

public class DeadlockFixed {
	static final Object resource1 = new Object();
	static final Object resource2 = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("T1: Đã khóa resource1");
                synchronized (resource2) {
                    System.out.println("T1: Đã khóa resource2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("T2: Đã khóa resource1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("T2: Đã khóa resource2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}