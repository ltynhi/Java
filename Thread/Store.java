package Thread;

import java.util.LinkedList;
import java.util.Queue;

public class Store {
    private Queue<Long> storage = new LinkedList<>();
    private final int CAPACITY = 5; 

    public synchronized boolean put(long item) {
        while (storage.size() == CAPACITY) {
            try {
                System.out.println("Kho đầy! Producer chờ...");
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        storage.add(item);
        System.out.println("** Sản phẩm " + item + " đã được tạo.");
        notify(); 
        return true;
    }

    public synchronized long get() {
        while (storage.isEmpty()) {
            try {
                System.out.println("Kho rỗng! Consumer chờ...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long item = storage.poll();
        System.out.println("-- Sản phẩm " + item + " đã được lấy.");
        notify();
        return item;
    }
}
