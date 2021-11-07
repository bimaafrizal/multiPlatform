package id.ac.uns.vokasi.multiplay.thread;

public class tugasThread extends Thread{
	public tugasThread(String name) {
		super(name);
	}
	public void run() {
		for(int i = 1; i < 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread " + getName() + " berjalan " + i);	
		}
	}
	public static void main(String[] args) {
		tugasThread l1 = new tugasThread("l1");
		tugasThread l2 = new tugasThread("l2");
		tugasThread l3 = new tugasThread("l3");
		tugasThread l4 = new tugasThread("l4");
		
		//l1.setPriority(MAX_PRIORITY);
		//l3.setPriority(NORM_PRIORITY);
		//l2.setPriority(MIN_PRIORITY);
		//l4.setPriority(MIN_PRIORITY);
		
		l1.start();
		l3.start();
		l2.start();
		try {
			l2.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l4.start();
	}

}
