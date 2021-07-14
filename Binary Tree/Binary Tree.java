package Java;

public class BinaryTree {

	public static void main(String[] args) {
		BinaryTrees bt = new BinaryTrees();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		System.out.println(bt);
	}
}
class Node
{
	int key;
	Node left, right;
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}
class BinaryTrees 
{
	Node root;
	BinaryTrees(int key) {
		root = new Node(key);
	}
	BinaryTrees() {
		root = null;
	}

}  // Contributed by Amresh Ranjan.
