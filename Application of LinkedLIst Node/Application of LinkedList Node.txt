package Java;

public class ApplicationLinkedList {

	public static void main(String[] args) {
		// Driver Code > by Ranjan's.
		ApplicationLinkedList ls = new ApplicationLinkedList();
		ls.push(12);
		ls.push(13);
		ls.push(14);
		ls.push(18);
		ls.Append(15);ls.push(10);
		ls.InsertAfter(ls.head.next, 200);
		ls.DeleteNode(12);
		ls.DeleteNode(200);
		ls.PrintList();
	}
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void InsertAfter(Node prev_node, int new_data) {
		if(prev_node == null) {
			System.out.println("previous node can't be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	public void Append(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	public void DeleteNode(int key) {
		Node temp = head, prev = null;
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key) {
			prev =temp;
			temp = temp.next;
		}
		if(temp == null) return;
		prev.next = temp.next;
	}
	public void PrintList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}	
}
// Contribute by Amresh Ranjan.