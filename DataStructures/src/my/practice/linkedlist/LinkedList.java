package my.practice.linkedlist;

public class LinkedList {

	Node head;

	private static class Node {

		int value;
		Node next;

		public int getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		Node(int value) {
			this.value = value;
			this.next = null;
		}

	}

	public void add(int item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
		} else {

			Node addNode = head;
			if (addNode != null) {
				while (addNode.getNext() != null) {
					addNode = addNode.getNext();
				}
				addNode.setNext(newNode);
			}
		}
	}
	
	
	public void traverse() {  
        Node traversalNode = head;  
        while (traversalNode != null) {  
            System.out.println(traversalNode.getValue());  
            traversalNode = traversalNode.getNext();  
        }  
    }  

	public void delete(int value) {  
        Node cur = head;  
        Node prev = null;  
  
        if (head != null && head.getValue()==value) {  
            head = head.next;  
            return;  
        }  
        while (cur != null && cur.getValue()!=value) {  
            prev = cur;  
            cur = cur.next;  
        }  
        if (prev == null)  
            return;  
  
        prev.next = cur.next;  
    }  

	
	 public static void main(String[] args) {  
	        LinkedList list = new LinkedList();  
	        list.add(5);  
	        list.add(7);  
	        list.add(9);  
	        list.add(11);  
	        System.out.println("Going to traverse after addition...");
	        list.traverse();
	        list.addNodeAtFront(2);
	        System.out.println("Going to traverse after addition of node at front...");
	        list.traverse();
	        list.addNodeAfter(10, list.getNodeAtGivenPosition(3));
	        System.out.println("Going to traverse node after given location");
	        list.traverse();
	        list.addNodeAtEnd(13);
	        System.out.println("Going to traverse list after addition on node at end...");
	        list.traverse();
	        list.delete(5);
	        System.out.println("Going to traverse after deletion...");
	        list.traverse();
	 }  
	 
	 public void addNodeAtFront(int newData){
		 Node nodeToAdd = new Node(newData);
		 nodeToAdd.setNext(head);
		 head = nodeToAdd;
	 }
	 
	 public void addNodeAfter(int newData, Node previousNode){
		 Node newNode = new Node(newData);
		 newNode.setNext(previousNode.getNext());
		 previousNode.setNext(newNode);
	 }
	 
	 public void addNodeAtEnd(int newData){
		 Node node = head;
		 Node newNode = new Node(newData);
		 if(node!=null){
			 while(node.getNext()!=null){
				 node = node.getNext();
			 }
			 node.setNext(newNode);
			 newNode.setNext(null);
		 }
	 }
	 
	 public Node getNodeAtGivenPosition(int location){
		 Node node = head;
		 int count = 1;
		 while(count<location){
			 node = node.getNext();
			 count++;
		 }
		 return node;
	 }
}
