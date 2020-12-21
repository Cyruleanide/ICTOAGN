import java.util.ArrayList;

public class UserCart {
    private ArrayList<Item> cart = new ArrayList<Item>();

    public UserCart(){

    }

    public void addCart(Item temp){
        cart.add(temp);
        System.out.println(temp + " was added to your cart");
    }
    
    public Item removeCart(Item temp) {
        Item i = temp;
        cart.remove(temp);
        System.out.println(temp + " was removed to your cart");
        return i;
    }

}
