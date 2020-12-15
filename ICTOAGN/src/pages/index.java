package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import display.Window;

public class index extends Container {

	public index(Window w) {
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
		
		JLabel furniture = new JLabel("Furniture:");
		
		JPanel center = new JPanel();
		JPanel department = new JPanel();
		center.setBorder(new LineBorder(Color.WHITE, 3));
		center.add(furniture);
		center.setLayout(new FlowLayout(5));
		department.setLayout(new FlowLayout(5));
		department.add(new JLabel(new ImageIcon("res/chair.jpg")));
		department.add(new JLabel(new ImageIcon("res/lamp.jpg")));
		department.add(new JLabel(new ImageIcon("res/chair.jpg")));
		department.add(new JLabel(new ImageIcon("res/lamp.jpg")));
		center.add(department);
		this.add(center, BorderLayout.CENTER);
	}
	
}
