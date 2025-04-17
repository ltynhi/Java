package Thread;

public class Producer extends Thread {
    private Store store;
    private long index = 1;
    private volatile boolean running = true;

    public Producer(Store s) {
        store = s;
    }
  public void stopRunning() {
            running = false;
        }

  public void run() {
      while (running) {
          try {
              store.put(index);
              index++;
              Thread.sleep(500);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
      System.out.println("Producer đã dừng.");
  }
}