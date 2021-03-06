package id.ac.uns.vokasi.multiplay.thread;

public class inheritanceThread extends Thread {
	public inheritanceThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread " + getName() + " berjalan " +i);
			
		}
	}
	
	public static void main(String[] a) {
		inheritanceThread speda = new inheritanceThread("speda");
		inheritanceThread vespa = new inheritanceThread("vespa");
		
		speda.setPriority(MAX_PRIORITY);//memprioritaskan salah satu thread
		speda.start();
		try {
			speda.join(3000);//memberi jeda
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vespa.start();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Speda masih jalan = " + speda.isAlive()); //mengecek apakah masih jalan
	}
}
