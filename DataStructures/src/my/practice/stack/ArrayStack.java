package my.practice.stack;

public class ArrayStack {

	int arr[];
	int capacity;
	int top;

	public ArrayStack(int capacity) {
		this.capacity = capacity;
		arr = new int[this.capacity];
		top = -1;
	}

	private boolean isOverFlow() {
		return top == capacity - 1;
	}

	private boolean isEmpty() {
		return (top == -1);
	}

	private int peek() {
		return arr[top];
	}

	private int pop() {
		if(isEmpty()){
			System.out.println("stack is underflow...");
		}
		return arr[top--];
	}

	private void push(int i) {
		if(isOverFlow()){
			System.out.println("stack is overflow...");
		}
		arr[++top] = i;
	}

	public static void main(String[] args) {
		ArrayStack arrayStack = new ArrayStack(5);
		System.out.println("Going to push elements in array using stack...");
		for (int i = 0; i < 5; i++) {
			System.out.println("current element pushed is: " + i);
			arrayStack.push(i);
		}
		System.out.println("Going to pop element from stack using array...");
		while (!arrayStack.isEmpty()) {
			System.out
					.println("current popped element is: " + arrayStack.pop());
		}
	}
}
