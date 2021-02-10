package javademo;

import java.util.Scanner;

public class BinaryTrees {

	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
	}
	static Node createTree() {
		Node root = null;
		System.out.println("Enter data :");
		int data = sc.nextInt();
		root = new Node(data);
		if(data == -1) return null;
		System.out.println("Enter left Node:" + data);
		root.left = createTree();
		System.out.println("Enter right Node:" + data);
		root.right = createTree();
		return root;	
	}
	static void preorder(Node root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	static void inorder(Node root) {
		if(root == null) return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	static void postorder(Node root) {
		if(root == null) return;
		inorder(root.left);
		inorder(root.right);
		System.out.print(root.data + " ");
	}
}
class Node {
	Node left, right;
	int data;
	Node(int data) {
		this.data = data;
	}
} // Contributed by Amresh Ranjan.
