package Thread;

public class Consumer extends Thread {
    private Store store;
    private volatile boolean running = true; 
    public Consumer(Store s) {
        store = s;
    }
    public void stopRunning() {
        running = false;
    }
    public void run() {
        while (running) {
            try {
                store.get();
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer đã dừng.");
    }
}
