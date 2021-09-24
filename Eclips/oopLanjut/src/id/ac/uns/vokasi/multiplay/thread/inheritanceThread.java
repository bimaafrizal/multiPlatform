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
		
		speda.start();
		vespa.start();
	}
}
