package pages;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import backend.Cart;
import backend.Item;
import backend.ItemStock;
import display.Window;

public class Product extends Page {
	
	int quant = 0;

	public Product(Window w, String deptName, ItemStock itemStock) {
		super(w, itemStock.getName());
		Item item = itemStock.getStock()[0];
		
		JPanel itemPanel = new JPanel();
		JPanel imagePanel = new JPanel();
		itemPanel.setLayout(new GridLayout(0, 1, 0, 0));
		itemPanel.add(new JLabel(deptName + " - " + itemStock.getName()));
		imagePanel.add(new JLabel(new ImageIcon(item.getPath())));
		itemPanel.add(imagePanel);
		
		
		
		
		JPanel center = new JPanel();
		JPanel descPanel = new JPanel();
		JPanel quanPanel = new JPanel();
		JPanel buttonCont = new JPanel();
		center.setLayout(new BorderLayout(8, 6));
		descPanel.add(new JLabel(item.getDes()));
		
		JLabel quantity = new JLabel("Quantity: " + quant);
		JButton add = new JButton("+");
		JButton subtract = new JButton("-");
		subtract.setEnabled(false);
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				quant++;
				quantity.setText("" + quant);
				if(quant >= itemStock.getQuantity()) add.setEnabled(false);;
				if(!subtract.isEnabled()) subtract.setEnabled(true);
			}
		});
		
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				quant--;
				quantity.setText("" + quant);
				if(quant <= 0) subtract.setEnabled(false);
				if(!add.isEnabled()) add.setEnabled(true);
			}
		});
		
		
		
		buttonCont.add(quantity);
		buttonCont.add(subtract);
		buttonCont.add(add);
		if(itemStock.lowStock()) {
			buttonCont.add(new JLabel("Only " + itemStock.getQuantity() + " left in stock! Order Soon before they are gone!"));
		} else {
			buttonCont.add(new JLabel("In Stock - " + itemStock.getQuantity()));
		}
		
		JButton cartButton = new JButton("Add to Cart");
		cartButton.setSize(5, 3);
		
		cartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ItemStock stock = new ItemStock(itemStock.getName());
				stock.createStock(itemStock.getStock()[0], quant);
				Cart.addItem(stock);
				setCartAmount();
			}
		});
		
		buttonCont.add(cartButton);
		
		center.add(descPanel, BorderLayout.CENTER);
		center.add(buttonCont, BorderLayout.SOUTH);
		
		this.add(itemPanel, BorderLayout.WEST);
		this.add(center, BorderLayout.CENTER);
		
	}
	
}
