
import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    double e = .0000000001; //ignore this, this will be used in your next assignment
    Car c = new Car("Toyota", "Camry", 1999);
    
    @Test
    public void makeGetterTest() {
        assertEquals(c.getMake(), "Toyota");
    }

    @Test
    public void modelGetterTest() {
        assertEquals(c.getModel(), "Camry");
    }
    
    @Test
    public void yearGetterTest() {
        assertEquals(c.getYear(), 1999);
    }
    
    @Test
    public void makeSetterTest() {
        c.setMake("Honda");
        assertEquals(c.getMake(), "Honda");
    }

    @Test
    public void modelSetterTest() {
        c.setModel("Civic");
        assertEquals(c.getModel(), "Civic");
    }
    
    @Test
    public void yearSetterTest() {
        c.setYear(2005);
        assertEquals(c.getYear(), 2005);
    }
    
    //why don't we test turn on and turn off here? 
    
    }
    
    
    

