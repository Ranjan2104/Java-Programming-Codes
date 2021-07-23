package Java;
public class LinkedList {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.head = new Node(1);
		Node Second = new Node(2);
		Node Third = new Node(3);
		Node Fourth = new Node(4);
		Node Fiveth = new Node(5);
		ls.head.next = Second;
		Second.next = Third;
		Third.next = Fourth;
		Fourth.next = Fiveth;
		ls.PrintList();
	}
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	public void PrintList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
} // Contributed by Amresh Ranjan.
