package main;

import java.util.ArrayList;

public class Brand extends Car implements toString
{
    private String brandName;
    private String casetype;
    private Engine engine;
    private Options option;
    private String customerNick;

    public String getBrandName() {
        return brandName;
    }
    public static ArrayList <Brand> allCars = new ArrayList();

    public String getCustomerNick() {
        return customerNick;
    }

    public void setCustomerNick(String customerNick) {
        this.customerNick = customerNick;
    }
    
    
    public Brand(int ID, String color, String carType, String fuelType, int productionDate, String gearbox, String brandName, String casetype, Engine engine,String customerNick/*, Options option*/) 
    {
        super(ID, color, carType, fuelType, productionDate, gearbox);
        this.brandName = brandName;
        this.casetype = casetype;
        this.engine = engine;
        this.customerNick=customerNick;
        //this.option = option;
    }

    public int getID() {
        return ID;
    }
    
    //@Override
    public String toString()
    {
        return "Brand: " + brandName + "\nModel: " + casetype + "\n" + engine.toString()+"\nOwned by:" + customerNick/*+ option.toString()*/; 
    }
}
