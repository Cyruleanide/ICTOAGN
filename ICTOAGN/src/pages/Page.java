package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import backend.Cart;
import display.Window;

public class Page extends JPanel {
	
	JPanel itemList = new JPanel();
	

	public Page(Window w, String name) {
		
		this.setLayout(new BorderLayout(8, 6));
		
//================================================================================================================
		JPanel topPanel = new JPanel();
		JLabel header = new JLabel("ICTOAGN - " + name);
		JButton home = new JButton("Home");
		JButton buy = new JButton("Buy");
		
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w.switchPanel(1);
			}
		});
		
		topPanel.setBorder(new LineBorder(Color.BLACK, 3));
		topPanel.add(header);
		topPanel.add(home);
		
//===============================================================================================================
		
	/*	JPanel rightPanel = new JPanel();
		JLabel cartName = new JLabel("Cart: ");
		itemList.setLayout(new FlowLayout(5));
		if(Cart.getStock().size() > 0) {
			for(int i = 0; i < Cart.getStock().size(); i++) {
				itemList.add(new JLabel(Cart.getStock().get(i).getName() + ": "));
			}
		}
		
		rightPanel.add(cartName);
		rightPanel.add(itemList);
		*/
		
//===============================================================================================================		
		JPanel bottomPanel = new JPanel();
		JLabel bottomText = new JLabel("This site steals your COOKIES");
		JButton closeButton = new JButton("X close");
		bottomPanel.setBackground(Color.CYAN);
		
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bottomPanel.setVisible(false);
			}
		});
		
		bottomPanel.add(bottomText);
		bottomPanel.add(closeButton);
		
		this.add(topPanel, BorderLayout.NORTH);
		//this.add(rightPanel, BorderLayout.EAST);
		this.add(bottomPanel, BorderLayout.SOUTH);
		
	}
	
	public void setCartAmount() {
		if(Cart.getStock().size() > 0) {
			for(int i = 0; i < Cart.getStock().size(); i++) {
				itemList.add(new JLabel(Cart.getStock().get(i).getName() + ": "));
			}
		}
	}
	
}
