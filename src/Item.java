class Item{
    //Name of Item
    private String name;
    //properties of item
    private String prop; // may be changed later
    //description of item
    private String des; // may also change later

    //item ID
    private int iD;

    //There may also be a method to get photos of item

    public Item(String n, String p, String d, int i){
        name = n;
        prop = p;
        des = d;
        iD = i;
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

    //returns item id
    public int getID(){
        return iD;
    }
}