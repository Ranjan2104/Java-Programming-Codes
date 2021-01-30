package javademo;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertion {

	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		System.out.println("Inorder traversal before Insertion");
		inorder(root);
		int key = 12;
		insert(root, key);
		System.out.println("Inorder traversal after Insertion");
		inorder(root);
	}
	static class Node
	{
		int key;
		Node left, right;
		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}
	static Node root;
	static Node temp = root;
	static void inorder(Node temp) {
		if(temp == null) return;
		inorder(temp.left);
		System.out.println(temp.key + " ");
		inorder(temp.right);
	}
	static void insert(Node temp, int key) {
		if (temp == null) {
            root = new Node(key);
            return;
        }
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if(temp.left == null) {
				temp.left = new Node(key);
				break;
			} else q.add(temp.left);
			if(temp.right == null) {
				temp.right = new Node(key);
				break;
			} else q.add(temp.right);
		}
	}	
} // Contributed by Amresh Ranjan.
