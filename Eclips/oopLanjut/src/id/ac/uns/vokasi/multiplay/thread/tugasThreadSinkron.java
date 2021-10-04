package id.ac.uns.vokasi.multiplay.thread;

public class tugasThreadSinkron extends Thread {
	public tugasThreadSinkron(String name) {
		super(name);
	}
	public synchronized static void tampil(String name) {
		for(int i = 0; i < 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread " + name + " berjalan " +i);
			
		}
	}
	public void run() {
		tampil(getName());
	}
	public static void main(String[] args) {
		tugasThreadSinkron l2 = new tugasThreadSinkron("l2");
		tugasThreadSinkron l3 = new tugasThreadSinkron("l3");
		
		l2.start();
		l3.start();
	}

}
