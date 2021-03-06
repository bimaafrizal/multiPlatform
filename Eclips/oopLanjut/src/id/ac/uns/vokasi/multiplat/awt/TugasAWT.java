package id.ac.uns.vokasi.multiplat.awt;

import java.awt.*;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Timer;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TugasAWT extends JFrame{
	ButtonGroup bg;
	JButton button;
	JTextField txWaktu;
	JLabel lbtimer;
	int waktu;
	Timer timer;
	
	public TugasAWT() {
		setLayout(new GridLayout(2,2,4,4));
		txWaktu = new JTextField(5);
		add(txWaktu);
		button = new JButton("Start");
		add(button);
		lbtimer = new JLabel("Start", SwingConstants.LEFT);
		add(lbtimer);
		
		event e = new event();
		button.addActionListener(e);
	}
	public class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int waktu = (int)(Double.parseDouble(txWaktu.getText()));
			lbtimer.setText("sisa waktu: " + waktu);
			
			TimeClass tc = new TimeClass(waktu);
			timer = new Timer(1000, tc);
			timer.start();
		}	
	}
	public class TimeClass implements ActionListener{
		int counter;
		
		public TimeClass(int counter) {
			this.counter = counter;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			counter--;
			
			if(counter >= 1) {
				lbtimer.setText("sisa waktu: " + counter);
			} else {
				timer.stop();
				lbtimer.setText("Waktu Habis");
				
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
	public static void main(String[] args) {
		TugasAWT a = new TugasAWT();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(250, 100);
		a.setTitle("Countdown");
		a.setVisible(true);
	}
}
