package mod1_2day3;

public class ThreadDemo {
	public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("mythread...");
		t.setPriority(10);
		System.out.println(t);
		
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
			System.out.println(i);
			System.exit(0);//this is used to terminate the main thread...
		}
	}
}
