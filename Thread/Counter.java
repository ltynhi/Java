package Thread;

public class Counter {
	static int counter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread (() -> {
			for (int i=0;i<1000;i++)
			{
				counter++;
			}
		});
		Thread t2 =new Thread (() -> {
			for(int i=0;i<1000;i++) {
				counter++;
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Giá trị cuối của counter: " + counter);
	}

}
