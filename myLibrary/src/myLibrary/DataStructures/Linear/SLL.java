package myLibrary.DataStructures.Linear;

public class SLL {

	// Define node
	static class Node{
		int data;
		Node next;
		Node(int d) {
		data=d;
		next=null;
		}
	}
	
	
	// Create node
    static Node head=null;
    static Node tail=null;
	// Add node to SLL
    public void addNode(int data) 
    {
    	Node newNode=new Node(data);
    	
    	if(head==null) {
    		head=newNode;
    		tail=newNode;
    	}
    	else {
    		tail.next=newNode;
    		tail=newNode;
    	}
    }   
    
    // Search node in SLL
    public int searchNode(int key)
    {
    	int index=0;
    	Node current =head;
    	while(current !=null) {
    		if(current.data==key) {
    			return index;
    		}
    		current =current.next;
    		index++;
    	}
    	return -1;
    }
    
    // Delete node form SLL
    public void deleteNode(int key) 
    {
    	System.out.println("\ndeleting the node with the value "+key);
    	Node temp =head,prev=null;
    	
    	if(temp!=null && temp.data==key) {
    		head=temp.next;
    		return;
    	}
    	while(temp!=null&&temp.data!=key) {
    		prev=temp;
    		temp=temp.next;
    	}
    	if(temp==null) {
    		return;
    	}
    	prev.next=temp.next;
    }
    
    // Display SLL
    public void display() 
    {
    	Node current=head;
    	if(head==null) {
    		System.out.println("\nSingly linked list is empty");
    		return;
    	}
    	System.out.println("\nCurrent nodes of the singly linked list: ");
    	while(current !=null) {
    		System.out.print(current.data+" ");
    		current =current.next;
    	}
    	System.out.println();
    } 
    
    // Add any other parts needed

}
