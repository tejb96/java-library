package myLibrary.DataStructures.Tree;

public class BSTQueue {
	 private int max_size;
	    private int tail = -1;
	    private int head = -1;
	    private Node[] queue;

	    // Define Queue
	    public BSTQueue(int max_size) {
	        this.max_size = max_size;
	        queue = new Node[this.max_size];
	    }

	    // Enqueue
	    public void enqueue(Node data) {
	        if (tail == max_size - 1) {
	            return;
	        } else {
	            if (head == -1 && tail == -1) {
	                head = tail = 0;
	            } else {
	                tail += 1;
	            }
	            queue[tail] = data;
	        }
	    }

	    // Dequeue
	    public Node dequeue() {
	        Node data;
	        if (head < 0 || head > tail) {
	            System.out.println("Queue is empty - underflow");
	            return null;
	        } else {
	            data = queue[head];
	            queue[head] = null;
	            head += 1;
	        }
	        return data;
	    }

	    // Check if the queue is empty
	    public boolean isEmpty() {
	        return head < 0 || head > tail;
	    }
}
