package Thread;

public class MainProducerconsumer {

    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        producer.start();
        consumer.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dừng chương trình...");
        producer.stopRunning();
        consumer.stopRunning();
    }
}
