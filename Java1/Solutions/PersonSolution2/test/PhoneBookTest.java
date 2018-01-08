

import org.junit.Test;
import static org.junit.Assert.*;
import person.Person;

public class PhoneBookTest {
    
    public PhoneBookTest() {
    }
    
    PhoneBook p = new PhoneBook();
    Person a = new Person("Steve", "Smith", "99999999");
    
    
    @Test
    public void constructorTest() {
        assertEquals(p.length, 0);
    }
    
    @Test
    public void addPersonTest() {
        p.addPerson(a);
        assertEquals(p.list[0], a);
        assertEquals(p.length, 1);
    }
}
