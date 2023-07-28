package myLibrary.DataStructures.Linear;

public class DLL {

	// Define node
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d) {
		data=d;
		next=null;
		prev=null;
		}
	}
	
	// Create node
	static Node head=null;
    static Node tail=null;
	// Add node
    public void addNode(int data) 
    {
    	Node newNode=new Node(data);
    	
    	if(head==null) {
    		head=newNode;
    		tail=newNode;
    	}
    	else {
    		tail.next=newNode;
    		newNode.prev=tail;
    		tail=newNode;
    	}
    }   
    
    // Search node
    public int searchNode(int key)
    {
    	int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    
    // Delete node
    public void deleteNode(int key) 
    {
    	System.out.println("\nDeleting node for "+key);
    	Node current=head;
    	while (current != null) {
            if (current.data == key) {
                if (current.prev == null) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                } else if (current.next == null) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    } else {
                        head = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }
    
    // Display the DLL
    public void display() 
    {
    	 Node current = head;
         if (head == null) {
             System.out.println("\nDoubly linked list is empty");
             return;
         }
         System.out.println("\nCurrent nodes of the doubly linked list: ");
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
         System.out.println();
    } 
    
    // Add any other parts needed
}
