package main;
import java.util.Random;
public class Engine implements toString, CanStart
{
    private String engineBrand;
    private int hp;
    private int cc;
    private String engineType;
   // private int numberOfCylinders;
    Random rand = new Random();
    
    
    @Override
    public void startEngine() {
       if(this.engineBrand.equals("Ferrari")){
           int merc_fail_prob=rand.nextInt(100000);
           if(merc_fail_prob==500){
               System.out.println("Engine couldn't started...");
           }
           else {
               System.out.println("Engine successfully started...");
           }
       }
       if(this.engineBrand.equals("Honda")){
           int honda_fail_prob=rand.nextInt(1000);
           if(honda_fail_prob==500){
               System.out.println("Engine couldn't started...");
           }
           else {
               System.out.println("Engine successfully started...");
           }
       }
       if(this.engineBrand.equals("Tesla")){
           int tesla_fail_prob=rand.nextInt(100000);
           if(tesla_fail_prob==500){
               System.out.println("Engine couldn't started...");
           }
           else {
               System.out.println("Engine successfully started...");
           }
       }
       
    }
    
    public Engine(String engineBrand, int hp, int cc, String engineType/*, int numberOfCylinders*/) 
    {   
        this.engineBrand=engineBrand;
        this.hp = hp;
        this.cc = cc;
        this.engineType = engineType;
       // this.numberOfCylinders = numberOfCylinders;
    }
 @Override
 public String toString(){
     return     "Engine Brand: " + engineBrand + "\nEngine Power: " + hp+"\nEngine Type: "+engineType;
 }
}
