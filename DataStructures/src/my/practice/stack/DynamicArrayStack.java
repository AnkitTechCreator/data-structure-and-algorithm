package my.practice.stack;

public class DynamicArrayStack {

	int arr[];
	int capacity = 1;
	int top;

	public DynamicArrayStack() {
		arr = new int[capacity];
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
			System.out.println("stack is overflow, going to double its capacity");
			doubleStack();
		}
		arr[++top] = i;
	}
	
	private void doubleStack(){
		int[] newArr = new int[capacity*2];
		System.arraycopy(arr, 0, newArr, 0, capacity);
		capacity = capacity*2;
		arr = newArr;
	}

	public static void main(String[] args) {
		DynamicArrayStack arrayStack = new DynamicArrayStack();
		System.out.println("Going to push elements in array using stack...");
		for (int i = 0; i < 10; i++) {
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
