import java.util.ArrayList;

public class Shop {
    private String[] DepNams ={"Food", "Shopping Carts", "Clothing", "Furniture", "Wall Paper", "Workout Equipment", "Sports Equipment", "Tech", "Kitchen Appliances", "Seasonal"};
    
    private String[] Food ={"Apples","Oranges","Broccoli","Tomato","Chicken","Carrots","Grapes","Salmon","Cod","Beef"};
    private String[] Carts ={"Double decker Cart","Regular Cart","U boat cart","Hand truck", "Pallet jack"};
    private String[] clothes= {"Nike Shirt", "Nike Pants", "Nike Hoodie", "Under Armour Shirt", "Under Armour Pants", "Nike Shoes", "Retro Jordan Shoes", "Adidas Hoodie", "Adidas Pants", "Adidas Shoes"};
    private String[] Furn={"Lamp","Desk", "Coffee Table", "Couch", "Lounge Table", "Sofa", "Recliner"};
    private String[] Wallpap = {"Solid Sheet", "Vinyl Wallpaper", "Foil Wallpaper", "Printed Wallpaper", "Liner Wallpaper"};
    private String[] we ={"Dumbbells", "Barbell","Plates","Bench","Squat Rack"};
    private String[] se ={"Basketball Hoop", "Basketball", "Football", "Soccer ball", "Soccer Net"};
    private String[] tech= {"Macbook", "Windows Desktop", "Monitor", "Phones", "Keyboard and Mouse"};
    private String[] kitch = {"Oven", "Dishwasher","Sink","Refrigerator", "Freezer"};
    private String[] seas = {"Christmas Tree", "Flowers", "Ornament", "Christmas Lights", "Door Wreath"};
    private UserCart user = new UserCart();
    
    private ArrayList<ItemStock> Stock = new ArrayList<ItemStock>();
    public Shop(){
        this.user = new UserCart();
        for(int i =0; i <DepNams.length; i++){
            if(i == 0){
                for(String t : Food){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
            else if(i == 1){
                for(String t : Carts){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
             }
            else if(i == 2){
                for(String t : clothes){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
            else if(i == 3){
                for(String t : Furn){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
            else if(i == 4){
                for(String t : Wallpap){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
            else if(i == 5){
                for(String t : we){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
            else if(i == 6){
                for(String t : se){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
            else if(i == 7){
                for(String t : tech){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
            else if(i == 8){
                for(String t : kitch){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
            else if(i == 9){
                for(String t : seas){
                    Stock.add(new ItemStock(t, DepNams[i], DepNams[i]));
                }
            }
    } 
        
}
   
    public String getDept(ItemStock temp){
        return temp.getDeptNam();
    }

    public void addToCart(Item te){
        user.addCart(te);
        for(ItemStock i: Stock){
            if(i.getName() == te.getName() && i.outOfStock() == false){
                i.removeIt();
            }
        }
    }

    public void remoFroCart(Item temp){
        
        for(ItemStock i: Stock){
            if(i.getName() == temp.getName()){
                i.addtoStock(temp);
            }
        }
    }

    public void viewCart(){
        user.checkCart();
    }

    //test method(s)
    public void printStock(){
        for(ItemStock p : Stock){
            System.out.println(p.toString());
        }
    }
    public void getstocko(int i){
        addToCart(Stock.get(2).removeIt());
    }
    public int getQu(){
        return Stock.get(2).getQuantity();
    }
    public void getocart(){
     //   System.out.println(user.checkCart());
    }
}