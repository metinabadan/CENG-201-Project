package main;
public class Brand extends Car implements toString
{
    private String brandName;
    private String model;
    private Engine engine;
    private Options option;
    
    public Brand(int ID, String color, String carType, String fuelType, int productionDate, String gearbox, String brandName, String model, Engine engine, Options option) 
    {
        super(ID ,color, carType, fuelType, productionDate, gearbox);
        this.brandName = brandName;
        this.model = model;
        this.engine = engine;
        this.option = option;
    }
    
    public String toString()
    {
        return "Brand: " + brandName + "\nModel: " + model + "\n" + engine.toString() + option.toString(); 
    }
}
