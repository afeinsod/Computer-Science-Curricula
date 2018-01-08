package dllist;
import java.util.NoSuchElementException;

public class dllist {

    public enum position {

        FIRST, PREVIOUS, FOLLOWING, LAST
    };

    private class node {

        String item;
        node prev;
        node next;
    }

    private node first = null;
    private node current = null;
    private node last = null;
    private int currentPosition = 0;

    public void setPosition(position pos) {
        switch (pos) {
      
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public String getItem() throws NoSuchElementException {
        if (current == null) {
            throw new NoSuchElementException();
        } else {
            return current.item; 
        }
    }

    public int getPosition() throws NoSuchElementException {
        if (first == null) {
            throw new NoSuchElementException();
        }
	else {
        return currentPosition;
	}
    }

    public void delete() throws NoSuchElementException {
	
	}

    public void insert(String item, position pos) throws IllegalArgumentException {
        node n = new node();
        n.item = item;
        switch (pos) {
            
        }

    }

}