
import person.Person;


public class PhoneBook {
    Person[] list;
    int length;

    public PhoneBook() {
        list = new Person[100];
        length=0;
    }
    
    public void addPerson(Person p) {
        list[length++]=p;
    }
    
    public void printEntries() {
        for (int i =0; i<length; i++) {
             Person p = list[i];
             System.out.println(p.getFirstName() + " " +p.getLastName() + ", " + p.getPhoneNumber());
        }
    }
}
