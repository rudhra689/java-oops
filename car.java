import java.util.*;
class car
{

    public String Car_color;
    public String Car_brand;
    public String fuel_type;
    public int mileage;
   public void start()
   {

       System.out.println("Car Started:");
       System.out.println("Car color is :"+Car_color);
       System.out.println("Car Brand is:"+Car_brand);
       System.out.println("Car fuel type is:"+fuel_type);
       System.out.println("Car mileage is:"+mileage);
   }
    public void service()
    
   {
       System.out.println("Car Started:");
       System.out.println("Car color is :"+Car_color);
       System.out.println("Car Brand is:"+Car_brand);
       System.out.println("Car fuel type is:"+fuel_type);
       System.out.println("Car mileage is:"+mileage);
   }
    public void stop()
    
   {
       System.out.println("Car Started:");
       System.out.println("Car color is :"+Car_color);
       System.out.println("Car Brand is:"+Car_brand);
       System.out.println("Car fuel type is:"+fuel_type);
       System.out.println("Car mileage is:"+mileage);
   }
   public static void main(String args[])
   {   System.out.println("\nRUDHRA\n\n");
       car car1 = new car();
       car1.Car_color = "Blue";
       car1.Car_brand = "Audi";
       car1.fuel_type = "Deisel";
       car1.mileage = 100;
      car1.start();
       car car2 = new car();
       car2.Car_color = "Red";
       car2.Car_brand = "Tesla";
       car2.fuel_type = "EV";
       car2.mileage = 200;
       car2.stop();
       car car3 = new car();
       car3.Car_color = "Yellow";
       car3.Car_brand = "BMW";
       car3.fuel_type = "Petrol";
       car3.mileage = 300;
      car3.service();
      
    }
}

