class Item{
    //Name of Item
    private String name;
    //properties of item
    private String prop; // may be changed later
    //description of item
    private String des; // may also change later

  
    //There may also be a method to get photos of item

    public Item(String n, String p, String d){
        name = n;
        prop = p;
        des = d;

    }

    //gets name of item
    public String getName(){
        return name;
    }
    public String getProps(){
        return prop;
    }
    public String getDes(){
        return des;
    }

    public String toString(){
        return getName();
    }



    
}