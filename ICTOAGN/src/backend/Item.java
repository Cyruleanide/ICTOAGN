package backend;

public class Item{
    //Name of Item
    private String name;

    //description of item
    private String des; // may also change later

    //photo location
    private String path;

    // raw price of the item;
    private int price;

    // sale, stored as an integer representation of percent
    private int sale;


    //There may also be a method to get photos of item

    public Item(String n, String d, String p, int pr){
        name = n;
        des = d;
        path = p;
        price = pr;
        sale = 0;
    }

    //gets name of item
    public String getName(){
        return name;
    }

    public String getDes(){
        return des;
    }

    public String getPath() {
        return path;
    }

    public String toString(){
        return getName();
    }

    public int getPrice() {
        return price * ((100 + sale) / 100);
    }

    public int getSale() {
        return (100 + sale) / 100;
    }

    public void generateSale() {
        sale = (int) (Math.random()*100) + 1;
    }
}
