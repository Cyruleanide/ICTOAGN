package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Window {

	JFrame frame;
	//ArrayList<page> pages = new ArrayList<>();
	
	public Window() {
		frame = new JFrame("ICTOAGN Store");
		
		frame.setPreferredSize(new Dimension(1280, 960));
		frame.setMaximumSize(new Dimension(1280, 960));
		frame.setMinimumSize(new Dimension(1280, 960));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		Container mainContainer = frame.getContentPane();
		mainContainer.setLayout(new BorderLayout(8, 6));
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(Color.BLACK, 3));
		topPanel.add(new JLabel("ICTOAGN"));
		mainContainer.add(topPanel, BorderLayout.NORTH);
		
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
		mainContainer.add(center, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
	
}