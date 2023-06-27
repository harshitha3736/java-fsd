package Phase1_assessment3;

public class PP8_Stack {

	private static final int MAX_SIZE = 3;
	private int[] stackArray;
	private int top;

	public PP8_Stack() {
		stackArray = new int[MAX_SIZE];
		top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == MAX_SIZE - 1);
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack overflow! Cannot push " + data + " into the stack.");
		} else {
			stackArray[++top] = data;
			System.out.println(data + " pushed into the stack.");
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow! Cannot pop element from the stack.");
			return -1;
		} else {
			int poppedElement = stackArray[top--];
			System.out.println(poppedElement + " popped from the stack.");
			return poppedElement;
		}
	}


	public static void main(String[] args) {
		PP8_Stack stack = new PP8_Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		

	}

}

