package Thread;

public class ThreadInterrup {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Thread worker = new Thread(() -> {
				while(!
						Thread.currentThread().isInterrupted()) {
					System.out.println("Luồng đang chạy ...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						System.out.println("Luồng bị ngẳt");
						break;
					}
				}
			});
					worker.start();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					worker.interrupt();
				}
			}


