package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import backend.Department;
import backend.Item;
import backend.ItemStock;
import display.Window;

public class index extends Page {
	
	ArrayList<Department> departments = new ArrayList<Department>();
	Random r = new Random();

	public index(Window w) {
		super(w, "Home");
		
		File deptFile = new File("res");
		for(int k = 0; k < deptFile.list().length; k++) {
			departments.add(new Department(deptFile.list()[k]));
			System.out.println(deptFile.list()[k]);
		}
		
		for(int i = 0; i < departments.size(); i++) {
			Department temp = departments.get(i);
			File file = new File("res/" + temp.getDepNam());
			for(int j = 0; j < file.list().length; j++) {
				if(!file.list()[j].equals("desc")) {
				File description = new File("res/" + temp.getDepNam() + "/desc/" + file.list()[j].substring(0, file.list()[j].length() - 4) + ".txt");
				Scanner sc;
				try {
					sc = new Scanner(description);
				String tempDesc = "";
				while(sc.hasNextLine()) {
					tempDesc += sc.nextLine();
				}
				sc.close();
				Item tempItem = new Item(file.list()[j], tempDesc, "res/" + temp.getDepNam() + "/" + file.list()[j]);
				ItemStock tempStock = new ItemStock(file.list()[j].substring(0, file.list()[j].length() - 4));
				tempStock.createStock(tempItem, r.nextInt(100) + 1);
				temp.addItem(tempStock);
				System.out.println(file.list()[j].substring(0, file.list()[j].length() - 4));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			}
		} 
		}
		
		JPanel departmentSection = new JPanel();
		
		departmentSection.setLayout(new GridLayout(0, 1, 0, 0));
		departmentSection.setBorder(new LineBorder(Color.BLACK, 3));
		
		for(int i = 0; i < departments.size(); i++) {
			Department temp = departments.get(i);
			JLabel tempLabel = new JLabel(temp.getDepNam());
			JPanel tempPanel = new JPanel();
			tempPanel.setLayout(new FlowLayout(5));
			ArrayList<ItemStock> tempItems = temp.getDepart();
			for(int j = 0; j < tempItems.size(); j++) {
				tempPanel.add(new JLabel(new ImageIcon(tempItems.get(j).getStock()[0].getPath())));
				JPanel tempBuy = new JPanel();
				JButton buyButton = new JButton("Buy: " + tempItems.get(j).getName());
				JLabel quantity = new JLabel("Quantity: " + tempItems.get(j).getQuantity());
				tempBuy.setLayout(new GridLayout(0, 1, 0, 0));
				tempBuy.add(quantity);
				tempBuy.add(buyButton);
				tempPanel.add(tempBuy);
			}
			departmentSection.add(tempLabel);
			departmentSection.add(tempPanel);
		}
		
		JScrollPane sPane = new JScrollPane(departmentSection);
		this.add(sPane, BorderLayout.CENTER);
	}
	
	/* private void addDept(String deptName, String stockName, Item item) {
		Random r = new Random();
		Department d = new Department(deptName);
		ItemStock stock = new ItemStock(stockName);
		stock.createStock(item, r.nextInt(101) + 1);
	} */
	
}
