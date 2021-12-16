package main;
import java.util.ArrayList;

public class SystemClass 
{
    public static int total_car = 0;
    public static ArrayList<Car> carList = new ArrayList<Car>();
    
    public static boolean addCar(Car car)
    {
        boolean flag = true;
        for (int i = 0 ; i < carList.size() ; i++)
        {
            if (carList.get(i).ID == car.ID)
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
            carList.add(car);
            total_car++;
            return true;
        }
    }
    
    public static boolean removeCar(int ID)
    {
        for (int i = 0 ; i < carList.size() ; i++)
        {
            if (carList.get(i).ID == ID)
            {
                carList.remove(i);
                total_car--;
                return true;
            }
        }
        return false;
    }
    
    public static Car searchCarID(int ID)
    {
        for (int i = 0 ; i < carList.size() ; i++)
        {
            if (carList.get(i).ID == ID)
            {
                return carList.get(i);
            }
        }
        return null;
    }
    
    public static String deleteCar(int ID)
    {
        for (int i = 0 ; i < carList.size() ; i++)
        {
            if (carList.get(i).ID == ID)
            {
                return carList.get(i).toString();
            }
        }
        return "There is no car with ID that you enter.";
    }
    
    public void displayCar()
    {
        for (int i = 0 ; i < carList.size() ; i++)
        {
            carList.get(i).toString();
        }
    }
}
