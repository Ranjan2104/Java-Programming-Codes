package javademo;

public class CheckTreeIndentical {

	public static void main(String[] args) {
	Node x = new Node(15);
        x.left = new Node(10);
        x.right = new Node(20);
        x.left.left = new Node(8);
        x.left.right = new Node(12);
        x.right.left = new Node(16);
        x.right.right = new Node(25);
 
        Node y = new Node(15);
        y.left = new Node(10);
        y.right = new Node(20);
        y.left.left = new Node(8);
        y.left.right = new Node(12);
        y.right.left = new Node(16);
        y.right.right = new Node(30);
		if(issame(x,y))
			System.out.println("Same");
		else
			System.out.println("Not same");
	}
	public static boolean issame(Node x, Node y) { //recursion method
		if(x == null && y == null) return true;
		return (x != null && y != null) && (x.data == y.data) &&
				issame(x.left, y.left) && issame(x.right, y.right);
	}
}
class Node {
	int data;
	Node left = null;
	Node right = null;
	Node(int data) {
		this.data = data;
	}
} // Contributed by Amresh Ranjan.

