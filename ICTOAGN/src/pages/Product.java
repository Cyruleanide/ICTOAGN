package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import display.Window;

public class Product extends Container {

	public Product(int n, Window w) {
		this.setLayout(new BorderLayout(8, 6));
		
		JPanel topPanel = new JPanel();
		JButton indexButton = new JButton("Home");
		JButton pButton = new JButton("Product");
		indexButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w.setHome();
			}
		});
		pButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w.setProduct();
			}
		});
		topPanel.setBorder(new LineBorder(Color.BLACK, 3));
		topPanel.add(new JLabel("ICTOAGN"));
		topPanel.add(indexButton);
		topPanel.add(pButton);
		this.add(topPanel, BorderLayout.NORTH);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new LineBorder(Color.BLACK, 3));
		leftPanel.add(new JLabel(new ImageIcon("res/chair.jpg")));
		this.add(leftPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(new LineBorder(Color.BLACK, 3));
		centerPanel.add(new JLabel("This is a chair please seit in it if you buy please aanfdjk thanksd."));
		this.add(centerPanel, BorderLayout.CENTER);
	}
	
}
