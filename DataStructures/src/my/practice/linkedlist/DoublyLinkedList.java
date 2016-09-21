package my.practice.linkedlist;

public class DoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	private static class Node<T> {

		private T value;
		private Node<T> previous;
		private Node<T> next;

		Node(T value) {
			this.value = value;
		}

		Node(T value, Node<T> previous, Node<T> next) {
			this.value = value;
			this.previous = previous;
			this.next = next;
		}
	}

	public void add(T value) {
		Node<T> newNode = new Node<T>(value);
		Node<T> tempNode = this.tail;
		newNode.previous = tempNode;
		newNode.next = null;
		tail = newNode;

		if (tempNode == null) {
			head = newNode;
		} else {
			tempNode.next = newNode;
		}
	}
	
	public void traverse(){
		Node node = head;
		while(node!=null){
			System.out.println(node.value);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println("Going to traverse list...");
		list.traverse();
	}
}