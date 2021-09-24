package id.ac.uns.vokasi.multiplay.thread;

public class interfaceThread implements Runnable{
	String name;
	public interfaceThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<6;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread " + this.name + " berjalan " + i);
		}
	}
	public static void main(String[] a) {
		Thread speda = new Thread(new interfaceThread("sepeda"));
		Thread vespa = new Thread(new interfaceThread("vespa"));
		
		speda.start();
		vespa.start();
	}
}
