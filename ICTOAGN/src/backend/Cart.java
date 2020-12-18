package backend;

import java.util.ArrayList;

public class Cart {
	
	static ArrayList<ItemStock> items = new ArrayList<ItemStock>();
	
	 public static void addItem(ItemStock stock) {
		items.add(stock);
	}
	
	public static void removeItem(ItemStock stock) {
		items.remove(stock);
	}
	
	public static ArrayList<ItemStock> getStock() {
		return items;
	}

}
