class Item{
    //Name of Item
    private String name;

    //There may also be a method to get photos of item

    public Item(String n){
        name = n;

    }

    //gets name of item
    public String getName(){
        return name;
    }
    

    public String toString(){
        return getName();
    }



    
}