package queue;

/**
 *
 * @author Alix
 */
public class Market {

    Queue q;
    double gains;

    public Market() {
        q = new Queue();
        gains = 0;
    }

    public void buyShares(int numShares, double price) {
        for (int i = 0; i < numShares; i++) {
            q.insert(price);
        }
    }

    public void sellShares(int numShares, double price) {
        double tmp;
        for (int i = 0; i < numShares; i++) {
            tmp = (double) q.remove();
            gains += price - tmp;
        }

    }

    public double getGains() {
        return gains;
    }
}
