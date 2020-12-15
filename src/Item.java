class Item{
    //Name of Item
    private String name;
    
    //description of item
    private String des; // may also change later

  
    //There may also be a method to get photos of item

    public Item(String n, String d){
        name = n;
        
        des = d;

    }

    //gets name of item
    public String getName(){
        return name;
    }
    
    public String getDes(){
        return des;
    }

    public String toString(){
        return getName();
    }



    
}