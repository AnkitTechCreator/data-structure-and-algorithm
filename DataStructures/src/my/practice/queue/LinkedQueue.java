package my.practice.queue;

public class LinkedQueue {

	private Node frontNode;
	private Node rearNode;
	
	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	public LinkedQueue(){
		this.frontNode = null;
		this.rearNode = null;
	}
	
	public boolean isEmpty(){
		return frontNode==null;
	}
	
	public void enqueue(int data){
		Node newNode = new Node(data);
		if(rearNode!=null){
			rearNode.setNext(newNode);
		}
		rearNode = newNode;
		if(frontNode==null){
			frontNode = rearNode;
		}
	}
	
	public int dequeue(){
		int data;
		if(isEmpty()){
			throw new RuntimeException("Empty Queue");
		}else{
			data = frontNode.getData();
			frontNode = frontNode.getNext();
		}
		return data;
	}
	
	public static void main(String[] args) {
		LinkedQueue linkedQueue = new LinkedQueue();
		System.out.println("Going to insert data in queue");
		linkedQueue.enqueue(10);
		linkedQueue.enqueue(20);
		linkedQueue.enqueue(30);
		linkedQueue.enqueue(40);
		linkedQueue.enqueue(50);
		System.out.println("Going to dequeue data from queue");
		System.out.println("current dequeued element is: "+ linkedQueue.dequeue());
		System.out.println("current dequeued element is: "+ linkedQueue.dequeue());
		System.out.println("current dequeued element is: "+ linkedQueue.dequeue());
		System.out.println("current dequeued element is: "+ linkedQueue.dequeue());
		System.out.println("current dequeued element is: "+ linkedQueue.dequeue());



	}

}
