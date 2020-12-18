package backend;

public class ItemStock {
    //NAme of Items in Stock
    private String Name;

    //quantity in stock
    private int quantity;



    //holds items
    private Item[] stock;

    public ItemStock(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public int getQuantity(){
        return quantity;
    }

    public void createStock(Item temp , int num){
        stock =  new Item[num];
        for(int i =0; i < num; i++){
            stock[i] = temp;
        }
        quantity = num;
    }

    public boolean lowStock(){
        if(stock.length <= 3 && stock.length != 0)
        return true;
        else 
        return false;
    }
    public boolean outOfStock(){
        if (stock.length ==0)
        return true;
        else 
        return false;
    }

    //testing purposes
    public void seeStock(){
        System.out.println(getName()+":");
        for (Item el: stock) {
            System.out.print(el+ " ");
        }
    }
    
    public Item[] getStock() {
    	return stock;
    }

}
