package id.ac.uns.vokasi.multiplay.thread;

import java.util.ArrayList;
import java.util.Arrays;

public class sinkronasiObjek extends Thread{
	static int[] nilai = {40,60,38,10,70};
	
	public sinkronasiObjek(String name) {
		super(name);
	}
	public static void tampil(String name) {
//		for(int i = 0;  i < nilai.length; i++) {
//			System.out.println("nilai asli " + nilai[i]);
//		}
		synchronized(nilai) {
			for(int i = 0;  i < nilai.length; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				nilai[i] += 3;
				System.out.println("Perubahan nilai " + name + " " +i + " = " + nilai[i]);
			}	
		}
	}
	public void run() {
		tampil(getName());
	}
	public static void main(String[] args) {
		sinkronasiObjek speda = new sinkronasiObjek("speda");
		sinkronasiObjek vespa = new sinkronasiObjek("vespa");
		speda.start();
		vespa.start();
	}
}
