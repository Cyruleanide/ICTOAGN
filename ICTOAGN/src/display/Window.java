package display;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import pages.Product;
import pages.index;


public class Window {

	JFrame frame;
	//ArrayList<page> pages = new ArrayList<>();
	
	public Window() {
		JPanel test = new JPanel();
		frame = new JFrame("ICTOAGN Store");
		
		frame.setPreferredSize(new Dimension(1280, 960));
		frame.setMaximumSize(new Dimension(1280, 960));
		frame.setMinimumSize(new Dimension(1280, 960));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.setContentPane(new index(this));
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
		
		frame.setVisible(true);
	}
	
	public void setHome() {
		frame.setContentPane(new index(this));
	}
	
	public void setProduct() {
		frame.setContentPane(new Product(1, this));
	}
	
}