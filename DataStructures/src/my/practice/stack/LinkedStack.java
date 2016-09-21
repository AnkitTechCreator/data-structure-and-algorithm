package my.practice.stack;

import java.util.EmptyStackException;

public class LinkedStack {

	Node head;
	
	private static class Node {
		
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}
	
	public void push(int item){
		System.out.println("current pushed item is: "+ item);
		if(head==null){
			head = new Node(item);
		}else if(head.getData() ==  0){
			head.setData(item);
		}else{
			Node nodeToPush = new Node(item);
			nodeToPush.setNext(head);
			head = nodeToPush;
		}
	}
	
	public int pop(){
		int poppedElement = 0;
		if(head == null){
			throw new EmptyStackException();
		}else{
			poppedElement = head.getData();
			System.out.println("current popped item is: "+poppedElement);
			head = head.getNext();
		}
		return poppedElement;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public int top(){
		if(head == null){
			return 0;
		}else{
			return head.getData();
		}
	}
	
	private void deleteStack(){
		head = null;
		System.out.println("stack deleted successfully...");
	}
	
	public static void main(String[] args) {
		LinkedStack linkedStack = new LinkedStack();
		linkedStack.push(1);
		linkedStack.push(2);
		linkedStack.push(3);
		linkedStack.push(4);
		linkedStack.push(5);
		
		linkedStack.pop();
		linkedStack.pop();
		linkedStack.pop();
		linkedStack.pop();
		linkedStack.pop();
		
		System.out.println("is stack empty? "+ linkedStack.isEmpty());
		if(linkedStack.isEmpty()){
			linkedStack.deleteStack();
		}
	}

}
