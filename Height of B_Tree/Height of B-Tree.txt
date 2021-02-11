package javademo;

public class HeightBTree {

	public static void main(String[] args) {
	Node root = null;
		
        root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
 
        System.out.print("The height of the binary tree is " + height(root));
	}
	public static int height(Node root) {
		if(root == null) return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}
}               
class Node{
	Node left = null, right = null;
	int data;
	Node(int data) {
		this.data = data;
	}
} // Contributed by Amresh Ranjan.
