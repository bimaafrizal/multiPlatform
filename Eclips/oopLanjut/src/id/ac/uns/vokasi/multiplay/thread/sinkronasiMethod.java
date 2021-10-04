package id.ac.uns.vokasi.multiplay.thread;

public class sinkronasiMethod extends Thread {
	static int energi = 4;
	public sinkronasiMethod(String name) {
		super(name);
	}
	public synchronized static void tampil(String name) {
		for(int i = 0; i<6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			energi+=1;
			System.out.println("Thread " + name + " berjalan " + i + " energi " + energi);	
		}
	}
	public void run() {
		tampil(getName());
	}
	
	public static void main(String[] args) {
		sinkronasiMethod speda = new sinkronasiMethod("speda");
		sinkronasiMethod vespa = new sinkronasiMethod("vespa");
		
		speda.start();
		vespa.start();
	}
}
