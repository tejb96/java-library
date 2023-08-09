package myLibrary.DataStructures.Tree;

public class BST {

	// Create node
	Node root;
	public BST(){root=null;}
	// Insert new node in BST - you can use recursive or iterative method
	public Node insert(int data, Node root) 
	{
		if(root==null) {
			return new Node(data);
		}
		if(data<root.data) {
			root.left=insert(data,root.left);
		}
		else {
			root.right=insert(data,root.right);
		}
		return root;
	}
	
	// Inorder traversal - recursive OR iterative
	public void inOrder(Node root) 
	{
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}

	// Preorder traversal - recursive OR iterative
	public void preOrder(Node root) 
	{
		if(root !=null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	// Postorder traversal - recursive OR iterative
	public void postOrder(Node root) 
	{
		if(root !=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	// Breadth first traversal - recrsive OR iterative
	public void breadthFirstTraversal(Node root) 
	{
		if(root==null) {return;}
		BSTQueue q=new BSTQueue(100);
		q.enqueue(root);
		while(!q.isEmpty()) {
			Node node =q.dequeue();
			System.out.print(node.data+" ");
			if(node.left!=null) {
				q.enqueue(node.left);
			}
			if(node.right!=null) {
				q.enqueue(node.right);
			}
		}
	}
	
	// Search in BST
	public Node searchBinarySearchTree(Node node, int key)
	{
		while(node != null) {
			if(key==node.data) {
				return node;
			}
			else if(key<node.data) {
				node=node.left;
			}
			else {
				node=node.right;
			}
		}
		return null;
	}
	
	// Delete from BST
	public Node deleteNode(Node root, int key) 
	{
		if(root==null) {
			return root;
		}
		if(root.data>key) {
			root.left=deleteNode(root.left,key);
			return root;
		}
		else if(root.data<key) {
			root.right=deleteNode(root.right, key);
			return root;
		}
		
		if (root.left == null) {
           return root.right;
        } 
		else if (root.right == null) {
                return root.left;
        }
	
		else {
			Node successorParent=root;
			Node successor=root.right;
			while(successor.left!=null) {
				successorParent=successor;
				successor=successor.left;
			}
			if(successorParent!=root) {
				successorParent.left=successor.right;
			}
			else {
				successorParent.right=successor.right;
			}
			root.data=successor.data;
		}
		 return root;
	}
	
	// Add any other parts needed

}
