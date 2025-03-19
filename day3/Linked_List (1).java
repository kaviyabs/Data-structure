package addon;


public class Linked_List {
	    Node head;
	    static class Node {
	        int data;
	        Node next;
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }
	    public int findMiddle() {
	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;          
	            fast = fast.next.next;     
	        }

	        return slow.data;
	    }
	    public void append(int newData) {
	        Node newNode = new Node(newData);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        newNode.next = null;
	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }
	        last.next = newNode;
	    }
	    public static void main(String[] args) {
	        Linked_List list = new Linked_List();        
	        list.append(10);
	        list.append(20);
	        list.append(30);
	        list.append(40);
	        list.append(50);
	        list.append(60);
	        list.append(70);
	        System.out.println("The middle element is: " + list.findMiddle());
	    }
	}

