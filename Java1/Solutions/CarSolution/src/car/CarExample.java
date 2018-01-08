
package car;

public class CarExample {
   
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        String nickName1= "Stella";
        String color1="Teal";
        int yearsOwned1=8;
        double miles1=189067.9;
        int year1= 1999;
        
       Car car1= new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear()
               + ", nicknamed " + car1.getNickName() + ", colored" + car1.getColor()+" has " + car1.getMiles() + " miles, owned for "
                + car1.getYearsOwned() + " years.");
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }
    
}
