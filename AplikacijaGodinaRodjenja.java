package godinaRodjenja;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AplikacijaGodinaRodjenja extends JFrame{
	
	JTextField god;
	JButton dugme;
	
	public AplikacijaGodinaRodjenja()
	{  
		Container povrsinaProzora = getContentPane();
		povrsinaProzora.setLayout(null);
		
		god = new JTextField();
		god.setBounds(50, 10, 200, 40);
		povrsinaProzora.add(god);
		
		dugme = new JButton();
		dugme.setBounds(50, 60, 200, 40);
		dugme.setText("OK");
		dugme.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


				try {
					int n = Integer.parseInt(god.getText());
					int rez = 2016 - n;
					god.setText(Integer.toString(rez));
				}
				catch (NumberFormatException e2)
				{
					god.setText("Unesite broj!");
				}
				
			}
		});
		
		povrsinaProzora.add(dugme);
		
		setTitle("Koliko godina imas?");
		setSize(450, 170);
		setVisible(true);
		//konstruktor
	}

	public static void main(String[] args) {
		
		AplikacijaGodinaRodjenja aplikacija = new AplikacijaGodinaRodjenja();
		aplikacija.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
