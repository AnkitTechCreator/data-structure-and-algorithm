package my.practice.queue;

import java.util.LinkedList;
import java.util.Stack;

public class ArrayQueue {

	int capacity;
	int front;
	int rear;
	int[] arr;

	public ArrayQueue(int size) {
		capacity = size;
		front = -1;
		rear = -1;
		arr = new int[size];
	}

	public boolean isFull() {
		return (rear + 1) % capacity == front;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public int getQueueSize() {
		return (capacity - front + rear + 1) % capacity;
	}

	public void enqeue(int data) {
		if (isFull()) {
			throw new RuntimeException("Queue overflow");
		}
		rear = (rear + 1) % capacity;
		arr[rear] = data;
		if (front == -1) {
			front = rear;
		}
	}

	public int dequeue() {
		int data;
		if (isEmpty()) {
			throw new RuntimeException("Queue underflow");
		} else {
			data = arr[front];
			if (front == rear) {
				front = rear - 1;
			} else {
				front = (front + 1) % capacity;
			}
		}
		return data;
	}

	public static void main(String[] args) {
		ArrayQueue arrayQueue = new ArrayQueue(5);
		System.out.println("Going to insert data in queue");
		arrayQueue.enqeue(10);
		arrayQueue.enqeue(20);
		arrayQueue.enqeue(30);
		arrayQueue.enqeue(40);
		arrayQueue.enqeue(50);
		System.out.println("Going to dequeue data from queue");
		System.out.println("current dequeued element is: "
				+ arrayQueue.dequeue());
		System.out.println("current dequeued element is: "
				+ arrayQueue.dequeue());
		System.out.println("current dequeued element is: "
				+ arrayQueue.dequeue());
		System.out.println("current dequeued element is: "
				+ arrayQueue.dequeue());
		System.out.println("current dequeued element is: "
				+ arrayQueue.dequeue());
		System.out.println("current dequeued element is: "
				+ arrayQueue.dequeue());
	}

}
