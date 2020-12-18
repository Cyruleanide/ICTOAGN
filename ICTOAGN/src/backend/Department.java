package backend;
import java.util.*;
public class Department {
    private ArrayList<ItemStock> Depart = new ArrayList<ItemStock>();
    
    //Name of department
    private String Name;

    public Department(String N){
        Name = N;
    }

    public String getDepNam(){
        return Name;
    }

    public void addItem(ItemStock temp){
        Depart.add(temp);
    }

    public void viewDepart(){
        System.out.println(getDepNam() +":");
        for(ItemStock temp : Depart){
                System.out.println(Depart);
        }
    }
    
    public ArrayList<ItemStock> getDepart() {
    	return Depart;
    }
}
