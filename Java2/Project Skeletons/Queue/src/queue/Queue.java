

package queue;

import java.util.NoSuchElementException;

class Queue {

    private class Node {

        double price;
        Node next;
    }
    private Node head = null;
    private Node tail = null;

    public boolean isempty() {
        return (head == null);
    }

    public void insert(double newprice) {
        Node n = new Node();
        n.price = newprice;
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }
        public double remove() {
            return 0;
        }
        
        public double peek() {
            return 0;
        }
    

}