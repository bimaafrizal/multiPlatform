package id.ac.uns.vokasi.multiplat.swingdesktop;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SwingDesktop extends JFrame implements ChangeListener, ActionListener {
	
	JMenuBar mb;
	JMenu m;
	JRadioButton rb1, rb2;
	ButtonGroup bg;
	
	JComboBox cb;
	JButton b;
	final String[] jenis = {"laki-laki", "perempuan"};
	
	public SwingDesktop() {
		super("Contoh JFrame di paket Swing");
		setSize(250,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb=new JMenuBar();
		m = new JMenu("Keluar");
		mb.add(m);
		m.addChangeListener((ChangeListener) this);
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(rb1= new JRadioButton("Laki-laki"));
		container.add(rb2= new JRadioButton("Perempuan"));
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		container.add(cb = new JComboBox(jenis));
		container.add(b = new JButton("Simpan"));
		b.addActionListener((ActionListener) this);
		
		
		setJMenuBar(mb);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingDesktop();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == m) {
			System.exit(ABORT);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b) {
			String pilCombo = cb.getSelectedItem().toString();
			String pilRadio = "";
			
			if(rb1.isSelected()) {
				pilRadio = rb1.getText();
			} else {
				pilRadio = rb2.getText();
			}
			System.out.println("Pilihan radio button=" +pilRadio);
			System.out.println("Pilihan combo box=" + pilCombo);
		}
	}
}
