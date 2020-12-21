package pages;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import display.Window;

public class Purchase extends Page {

	public Purchase(Window w, String name) {
		super(w, "ICTOAGN - Buy");
		
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextField creditCard = new JTextField();
		JTextField threeNum = new JTextField();
		JTextField expire = new JTextField();
		
		JLabel card = new JLabel("Enter your credit card number: ");
		JLabel threeNumbers = new JLabel("Enter the three numbers: ");
		JLabel expireLabel  = new JLabel("Enter the expiration date: ");
		
		center.add(card);
		center.add(creditCard);
		center.add(threeNumbers);
		center.add(threeNum);
		center.add(expireLabel);
		center.add(expire);
		
		this.add(center, BorderLayout.CENTER);
	}

}
