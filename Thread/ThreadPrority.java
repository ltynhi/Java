package Thread;

public class ThreadPrority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread highPriority = new Thread(() -> {
			for(int i=0;i<10;i++) {
				System.out.println("Luồng ưu tiên cao hơn chạy: " +i);
			}
		});
		Thread lowPriority = new Thread(() -> {
			for(int i=0;i<10;i++) {
				System.out.println("Luồng ưu tiên thấp hơn chạy: " +i);
			}
		});
		highPriority.setPriority(Thread.MAX_PRIORITY);
		lowPriority.setPriority(Thread.MIN_PRIORITY);
		highPriority.start();
		lowPriority.start();
	}

}
