package backend;

public class Item{
    //Name of Item
    private String name;
    
    //description of item
    private String des; // may also change later
    
    //photo location
    private String path;

  
    //There may also be a method to get photos of item

    public Item(String n, String d, String p){
        name = n;
        
        des = d;

        path = p;
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



    
}
