
import person.Person;


public class PhoneBookExample {

    public static void main(String[] args) {
        Person a = new Person("Joe", "Brown", "87654321");
        Person b = new Person("Lucy", "West", "12312312");
        Person c = new Person("Al", "Howe", "555555555");
        
        PhoneBook p = new PhoneBook();
        p.addPerson(a);
        p.addPerson(b);
        p.addPerson(c);
        
        p.printEntries();
        
    }
    
}
