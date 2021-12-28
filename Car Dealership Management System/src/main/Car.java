package main;
public abstract class Car implements toString
{
   protected int ID;
    protected String color;
    protected String carType;
    protected String fuelType;
    protected int productionDate;
    protected String gearbox;
    protected static int selledCarNo = 0;
    

    public Car(int ID, String color, String carType, String fuelType, int productionDate, String gearbox) 
    {
        this.ID = ID;
        this.color = color;
        this.carType = carType;
        this.fuelType = fuelType;
        this.productionDate = productionDate;
        this.gearbox = gearbox;
    }

    @Override
    public String toString() 
    {
        return "CAR PROPERTIES\n" + "Color: " + color + "\nCar Type: " + carType + "\nFuel Type: " + fuelType + "\nDate of Production" +
                productionDate + "\nGearbox Type" + gearbox + "\n";
    }

    
    
    
    public static void sellCar()
    {
        System.out.println("Car is selled");
        selledCarNo += 1;
    }
    
    
}
