package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import display.Window;

public class Page extends JPanel {
	

	public Page(Window w, String name) {
		
		this.setLayout(new BorderLayout(8, 6));
		
//================================================================================================================
		JPanel topPanel = new JPanel();
		JLabel header = new JLabel("ICTOAGN - " + name);
		JButton product = new JButton("Product");
		JButton home = new JButton("Home");
		
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w.switchPanel(1);
			}
		});
		
		product.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w.switchPanel(2);
			}
		});
		
		topPanel.setBorder(new LineBorder(Color.BLACK, 3));
		topPanel.add(header);
		topPanel.add(home);
		topPanel.add(product);
		
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
		this.add(bottomPanel, BorderLayout.SOUTH);
		
	}
	
}
