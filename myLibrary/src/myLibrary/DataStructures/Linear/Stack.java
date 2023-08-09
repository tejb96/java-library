package myLibrary.DataStructures.Linear;

public class Stack {
	int max;
	int top;
	int[] stack;
	// Define stack
	public Stack(int max){
		this.max=max;
		stack=new int[this.max];
		top=-1;
	}
	
	// Push 
	public void push(int data)
	{
		if(top==max-1) {
			return;
		}
		else {
			top+=1;
			stack[top]=data;
		}
	}
	
	// Pop
	public int pop()
	{
		int data;
		if(top<0) {
			return -1;
		}
		else {
			data=stack[top];
			stack[top]=0;
			top-=1;
		}
		return   data;
	}
	
	// Display stack
	public void display()
	{
		for(int i=0;i<stack.length;i++) {
			System.out.print(stack[i]+" ");
		}
	}
	
	// Add any other parts needed
	public boolean isEmpty() {
		return (top == -1);
	}
}
