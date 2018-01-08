
import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    double e = .0000000001;
    Car c = new Car("Toyota", "Camry", 1999, "Stella", "Teal", 8, 189067.9);
    
    @Test
    public void makeGetterTest() {
        assertEquals(c.getMake(), "Toyota");
    }
    
    @Test
    public void makeSetterTest() {
        c.setMake("Honda");
        assertEquals(c.getMake(), "Honda");
    }
    
    @Test
    public void modelGetterTest() {
        assertEquals(c.getModel(), "Camry");
    }
    
    @Test
    public void modelSetterTest() {
        c.setModel("Civic");
        assertEquals(c.getModel(), "Civic");
    }
    
    @Test
    public void yearGetterTest() {
        assertEquals(c.getYear(), 1999);
    }
    
    @Test
    public void yearSetterTest() {
        c.setYear(2005);
        assertEquals(c.getYear(), 2005);
    }
    
     @Test
    public void nickNameGetterTest() {
        assertEquals(c.getNickName(), "Stella");
    }
    
    @Test
    public void nickNameSetterTest() {
        c.setNickName("Bobby");
        assertEquals(c.getNickName(), "Bobby");
    }
    
     @Test
    public void colorGetterTest() {
        assertEquals(c.getColor(), "Teal");
    }
    
    @Test
    public void colorSetterTest() {
        c.setColor("Brown");
        assertEquals(c.getColor(), "Brown");
    }
    
    @Test
    public void yearsOwnedGetterTest() {
        assertEquals(c.getYearsOwned(), 8);
    }
    
    @Test
    public void yearsOwnedSetterTest() {
        c.setYearsOwned(3);
        assertEquals(c.getYearsOwned(), 3);
    }
    
    @Test
    public void milesGetterTest() {
        assertEquals(c.getMiles(), 189067.9, e);
    }
    
    @Test
    public void milesSetterTest() {
        c.setMiles(67152.2);
        assertEquals(c.getMiles(), 67152.2, e);
    }
    }
    
    
    


    
    
    

