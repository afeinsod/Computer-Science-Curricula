

class Stack {

    private Double[] stack;
    private int size;

    // Constructor for stack
    Stack () {
	stack = new Double[100];
    }

    public void push(Double d) {
	//adds the double d onto the stack, increments the size
    }

    public Double pop() {
	//removes the top number from the stack and returns it
        //make sure size is changed accordingly
        return 0.0;
    }

    public Double peek() {
	//returns the top number of the stack without modifying it
        return 0.0;
    }

    public int size() {
	//returns the current size of the stack
        return 0;
    }

}


public class Calc {

    public Stack st;

    Calc() {
	st = new Stack();
	}


    public void  push(double n) {
	if (st.size() > 100) {
		throw new RuntimeException();
	}
	else {
       		st.push(n);
	}
    }


    public double pop() {
	if(st.size() <= 0) {
		throw new RuntimeException();
	}
	else {
		return st.pop();}
    }

    public double  peek() {
	if(st.size() <= 0) {
		throw new RuntimeException();
	}
	else {
		return st.peek();}
    }



    public void  add() {
	if (st.size() < 2) {
		throw new RuntimeException();
		}
	else {
		double temp = st.pop() + st.pop();
		st.push(temp);
		}	
	}	
	

    public void subtract() {
	//subtracts the top 2 numbers on the stack, and pushes the result back onto the stack
    }


    public void multiply() {
	//multiplies the top 2 numbers on the stack, and pushes the result back onto the stack
    	}


    public void divide() {
	//divides the top 2 numbers on the stack, and pushes the result back onto the stack
    }

    public int depth() {
	return st.size();
    }

    public void  reciprocal() {
	if (st.size() < 1) {
		throw new RuntimeException();
	}
	else {
       		double temp = st.pop();
		temp = 1/temp;
		st.push(temp);
	}
    }

}