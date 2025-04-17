package Thread;

public class MemoryVisibilityFixed {
	static volatile boolean flag = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(() -> {
			while (!flag) {}
			System.out.println("Luồng t1 nhận thấy flag thay đổi");
		});
		Thread t2= new Thread (() ->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			flag =true;
			System.out.println("Luồng t2 thay đổi flag thành true");
		});
		t1.start();
		t2.start();
		}
}
