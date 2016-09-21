package my.practice.tree;

import my.practice.stack.LinkedStack;

public class BinaryTree {

	BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	private static class BinaryTreeNode {

		private int data;
		private BinaryTreeNode left;
		private BinaryTreeNode right;

		public BinaryTreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public BinaryTreeNode getLeft() {
			return left;
		}

		public void setLeft(BinaryTreeNode left) {
			this.left = left;
		}

		public BinaryTreeNode getRight() {
			return right;
		}

		public void setRight(BinaryTreeNode right) {
			this.right = right;
		}
	}

	public void recursivePreOrder(BinaryTreeNode root) {
		if (root != null) {
			System.out.println(root.getData());
			recursivePreOrder(root.getLeft());
			recursivePreOrder(root.getRight());
		}
	}
	
/*	public void nonRecursivePreOrder(BinaryTreeNode root){
		LinkedStack stack = new LinkedStack();
		if(root==null) return;
		while(true){
			while(root!=null){
				System.out.println(root.getData());
				stack.push(root.getData());
				root = root.getLeft();
			}
			if(stack.isEmpty()){
				break;
			}
			root.set = stack.pop();
		}
	}*/
	
	public void recursiveInOrder(BinaryTreeNode root){
		if(root!=null){
			recursiveInOrder(root.getLeft());
			System.out.println(root.getData());
			recursiveInOrder(root.getRight());
		}
	}
	
	public void recursivePostOrder(BinaryTreeNode root){
		if(root!=null){
			recursivePostOrder(root.getLeft());
			recursivePostOrder(root.getRight());
			System.out.println(root.getData());
		}
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.left = new BinaryTreeNode(2);
		tree.root.right = new BinaryTreeNode(3);
		tree.root.left.left = new BinaryTreeNode(4);
		tree.root.left.right = new BinaryTreeNode(5);
		tree.root.right.left = new BinaryTreeNode(6);
		tree.root.right.right = new BinaryTreeNode(7);

		tree.recursivePreOrder(tree.root);
		tree.recursiveInOrder(tree.root);
		tree.recursivePostOrder(tree.root);
	}
}
