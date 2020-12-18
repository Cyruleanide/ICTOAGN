package display;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import pages.Product;
import pages.index;


public class Window {

	JFrame frame;
	CardLayout cl;
	
	JPanel content = new JPanel();
	index page = new index(this);
	Product product = new Product(this);
	//ArrayList<page> pages = new ArrayList<>();
	
	public Window() {
		JPanel test = new JPanel();
		cl = new CardLayout();
		
		frame = new JFrame("ICTOAGN");
		
		frame.setPreferredSize(new Dimension(1280, 960));
		frame.setMaximumSize(new Dimension(1280, 960));
		frame.setMinimumSize(new Dimension(1280, 960));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
		
		content.setLayout(cl);
		content.add(page, "1");
		content.add(product, "2");
		
		cl.show(content, "1");
		
		frame.add(content);
		frame.setVisible(true);
	}
	
	public CardLayout getCL() {
		return cl;
	}
	
	public void switchPanel(int n) {
		switch(n) {
			default: cl.show(content, "1");
			break;
			case 1: cl.show(content,  "1");
			break;
			case 2: cl.show(content, "2");
			break;
		}
	}
	
}