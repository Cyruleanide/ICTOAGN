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

    public void addItem(Item temp){
        Depart.add(temp);
    }

    public void viewDepart(){
        System.out.println(getDepNam() +":");
        for(Item temp : Depart){
                System.out.println(Depart);
        }
    }
}
