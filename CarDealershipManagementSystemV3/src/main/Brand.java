package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Brand extends Car implements toString,Serializable
{
    private String brandName;
    private String casetype;
    private Engine engine;
    private Options option;

    public String getCasetype() {
        return casetype;
    }

    public Engine getEngine() {
        return engine;
    }

    public Options getOption() {
        return option;
    }

    public String getColor() {
        return color;
    }

    public String getCarType() {
        return carType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public String getGearbox() {
        return gearbox;
    }

    public static int getSelledCarNo() {
        return selledCarNo;
    }
    private String customerNick;
    
    public String getBrandName() {
        return brandName;
    }
   

    public String getCustomerNick() {
        return customerNick;
    }

    public void setCustomerNick(String customerNick) {
        this.customerNick = customerNick;
    }
    
    
    public Brand(String  ID, String color, String carType, String fuelType,String productionDate, String gearbox, String brandName, String casetype, Engine engine,String customerNick) 
    {
        super(ID, color, carType, fuelType, productionDate, gearbox);
        this.brandName = brandName;
        this.casetype = casetype;
        this.engine = engine;
        this.customerNick=customerNick;
        
        
       
    }


    public String  getID() {
        return ID;
    }
    
    
    
        
       
        
    
    
    
    
    @Override
    public String toString()
    {
        return "Brand: " + brandName + "\nModel: " + casetype + "\n" + engine.toString()+"\nOwned by:" + customerNick + "\nID: "+ID; 
    }
}
