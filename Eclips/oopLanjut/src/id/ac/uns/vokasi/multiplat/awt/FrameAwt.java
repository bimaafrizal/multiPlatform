package id.ac.uns.vokasi.multiplat.awt;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameAwt extends Frame implements WindowListener{
	String nim, nama, jk, alamat, tmp_lahir, tgl_lahir;
	TextField cnim, cnama,ctmp_lahir, ctgl_lahir;
	Choice cjk;
	TextArea calamat;
	Button b;
	
	public FrameAwt() {
		super("Biodata Data Mahasiswa");
		Panel p = new Panel();
		add(b = new Button("Simpan"));
		p.setLayout(new GridLayout(7,2)); //7 baris 2 kolom
		add(p);
		
		p.add(new Label("NIM"));
		p.add(cnim=new TextField());
		
		p.add(new Label("Nama"));
		p.add(cnama = new TextField());
		
		p.add(new Label("Jenis Kelamin"));
		cjk = new Choice();
		cjk.add("Laki-laki");
		cjk.add("Perempuan");
		p.add(cjk);
		
		p.add(new Label("Tempat Lahir"));
		p.add(ctmp_lahir= new TextField());
		
		p.add(new Label("Tanggal Lahir"));
		p.add(ctgl_lahir = new TextField());
		
		p.add(new Label("Alamat"));
		p.add(calamat = new TextArea());
		
		p.add(new Label());
		p.add(b = new Button("Simpan"));
		setSize(250, 300);
		setVisible(true);
		
		addWindowListener(this); //supaya terhubung
	}
	public static void main(String[] args) {
		new FrameAwt();
	}
	
	public boolean action(Event e, Object what) {
		if(what.equals("Simpan")) {
			nim = cnim.getText();
			nama = cnama.getText();
			tmp_lahir = ctmp_lahir.getText();
			tgl_lahir = ctgl_lahir.getText();
			alamat = calamat.getText();
			jk = cjk.getSelectedItem().toString();
			
			System.out.println(nim);
			System.out.println(nama);
			System.out.println(jk);
			System.out.println(tmp_lahir);
			System.out.println(tgl_lahir);
			System.out.println(alamat);
			
		}
		return true;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(ABORT);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}