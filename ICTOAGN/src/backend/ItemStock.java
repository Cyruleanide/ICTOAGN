import java.util.ArrayList;

public class ItemStock {
    //NAme of Items in Stock
    private String Name;

    //department name
    private String Dept;

    //description
    private String Des;

    //holds items
    private ArrayList<Item> stock = new ArrayList<Item>();

    public ItemStock(String Name, String Des, String Dept){
        this.Name = Name;
        this.Dept = Dept;
        this.Des = Des;
        createStock();
    }
    public String getName(){
        return Name;
    }
    public String getDeptNam(){
        return Dept;
    }

    public String getDes(){
        return Des;
    }
    public int getQuantity(){
        return stock.size();
    }

    public void createStock()
    {
        int num = (int)(Math.random()*10)+0;
        
        for(int i =0; i < num; i++){
            stock.add(new Item(Name));
        }
    }

    public boolean lowStock(){
        if(stock.size()<= 3 && stock.size() != 0)
        return true;
        else 
        return false;
    }
    public boolean outOfStock(){
        if (stock.size() ==0)
        return true;
        else 
        return false;
    }

    public String toString(){
        return "Name: "+getName() +", Stock: " + getQuantity();
    }

    public Item removeIt(){
        Item te = stock.get(0);
        stock.remove(0);
        return te;
    }
    public void addtoStock(Item temp){
        stock.add(temp);
    }

    //testing purposes
    public void seeStock(){
        System.out.println(getName()+":");
        for (Item el: stock) {
            System.out.print(el+ " ");
        }
    }


}
