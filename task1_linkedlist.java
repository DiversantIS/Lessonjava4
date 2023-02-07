public class LinkedListFlip {
	
	public static Node head;
	
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public static void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListFlip list = new LinkedListFlip();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		
		System.out.println("Original List: ");
		list.printList();
		
		list.reverse();
		
		System.out.println("\nFlipped List: ");
		list.printList();
		
		
	}

}