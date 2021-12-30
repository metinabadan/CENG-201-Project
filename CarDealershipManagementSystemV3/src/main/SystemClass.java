package main;
import java.util.ArrayList;

public class SystemClass 
{
    
    public static int total_car = 0;
    public static ArrayList <Brand> allCars = new ArrayList();
    
    public static boolean addCar(Brand br)
    {
        boolean flag = true;
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            if (allCars.get(i).ID.equals(br.getID()))
            {
                flag = false;
            }
        }
        if (flag == false)
        {
            System.out.println("There is a car within same ID.");
            return false;
        }
        else
        {
            allCars.add(br);
            total_car++;
            return true;
        }
    }
    
    public static boolean removeCar(String ID)
    {
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            if (allCars.get(i).ID.equals(ID))
            {
                allCars.remove(i);
                total_car--;
                return true;
            }
        }
        return false;
    }
    
    public static Brand searchCarID(String ID)
    {
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            if (allCars.get(i).ID.equals(ID))
            {
                return allCars.get(i);
            }
        }
        return null;
    }
    public static ArrayList <Brand> searchCarOwner(String customernick)
    {   
        CarInfo.ReadAllObject();
        ArrayList<Brand> arr=new ArrayList();
        for (Brand b : allCars)
        {
            if (b.getCustomerNick().equals(customernick))
            {
                arr.add(b);
            }
        }
        return arr;
    }
    public static String deleteCar(String ID)
    {
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            if (allCars.get(i).ID.equals(ID))
            {
                return allCars.get(i).toString();
            }
        }
        return "There is no car with ID that you enter.";
    }
    
    public void displayCar()
    {
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            allCars.get(i).toString();
        }
    }
    public static String IDinitialiser() {
        
        
        /////////
        int id;
        CarInfo.ReadAllObject();
        if(SystemClass.allCars.isEmpty())
        {
            return "001";
        }
        else
        {
            String ids=SystemClass.allCars.get(SystemClass.allCars.size()-1).getID();
            id=Integer.parseInt(ids);
            id++;
            if ( id< 10)
            {
                return("00" + String.valueOf(id));
             
            }
            else if (id >= 10 && id < 100)
            {
                return("0" + String.valueOf(id));
            }
            else if (id >= 100)
            {
                return(String.valueOf(id));
            }
        
            /////////
            String ID1=String.valueOf(id);
           return ID1;
        }
        
       
        
    }
    
}
