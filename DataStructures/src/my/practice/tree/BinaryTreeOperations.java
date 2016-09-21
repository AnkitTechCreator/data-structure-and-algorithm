package my.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeOperations {

	private Node root;

	private static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public void levelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.println(temp.data);

			if (temp.left != null) {
				queue.add(temp.left);
			}

			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}
	
	public void printExtremeNodes() {
		// TODO
	}

	public int getMaxElementInBinaryTreeInRecursiveWay(Node root) {
		int rootValue, left, right, max = Integer.MIN_VALUE;
		if (root != null) {
			rootValue = root.data;
			left = getMaxElementInBinaryTreeInRecursiveWay(root.left);
			right = getMaxElementInBinaryTreeInRecursiveWay(root.right);
			max = (left > right) ? left : right;
			if (rootValue > max)
				max = rootValue;
		}
		return max;
	}

	public int getMaxElementInBinaryTreeInNonRecursiveWay(Node root) {
		int max = Integer.MIN_VALUE;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			if (temp.data > max) {
				max = temp.data;
			}
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		return max;
	}

	public boolean searchElementInBinaryTreeInRecursiveWay(Node root,
			int itemToSearch) {
		if (root != null) {
			if (root.data == itemToSearch) {
				return true;
			} else if (searchElementInBinaryTreeInRecursiveWay(root.left,
					itemToSearch)) {
				return true;
			} else if (searchElementInBinaryTreeInRecursiveWay(root.right,
					itemToSearch)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean searchElementInBinaryTreeInNonRecursiveWay(Node root, int itemToSearch){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			if(temp.data==itemToSearch){
				return true;
			}
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		BinaryTreeOperations binaryTreeOperations = new BinaryTreeOperations();
		binaryTreeOperations.root = new Node(1);
		binaryTreeOperations.root.left = new Node(2);
		binaryTreeOperations.root.right = new Node(3);
		binaryTreeOperations.root.left.left = new Node(4);
		binaryTreeOperations.root.left.right = new Node(5);
		binaryTreeOperations.root.right.left = new Node(6);
		binaryTreeOperations.root.right.right = new Node(7);

		System.out.println("Level order traversal of binary tree is: ");
		binaryTreeOperations.levelOrder();

		System.out
				.println("Maximum value in Binary tree in recursive way: "
						+ binaryTreeOperations
								.getMaxElementInBinaryTreeInRecursiveWay(binaryTreeOperations.root));
		System.out
				.println("Maximum value in Binary tree in non-recursive way: "
						+ binaryTreeOperations
								.getMaxElementInBinaryTreeInNonRecursiveWay(binaryTreeOperations.root));

		System.out.println("Going to search element in BT in recursive way...item status: "
				+ binaryTreeOperations.searchElementInBinaryTreeInRecursiveWay(
						binaryTreeOperations.root, 4));
		;
		
		System.out.println("Going to search element in BT in non-recursive way...item status: "
				+ binaryTreeOperations.searchElementInBinaryTreeInNonRecursiveWay(
						binaryTreeOperations.root, 4));
		;

	}

}
