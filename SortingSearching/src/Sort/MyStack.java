package Sort;

public class MyStack {
    private int top,maxSize;
    private int arr[];
    public MyStack(int s){
    	maxSize = s;
    	arr = new int[maxSize];
    	top = -1;
    }
    public void push(int num){
    	if(!isFull()){
    		arr[++top] = num;
    	}
    	else
    		System.out.println("Stack is Full");
    }
    public int pop(){
    	if(size()<0)
    	{
    		System.out.println("Stack  is Empty");
    		return -1;
    	}
    	return arr[top--];
    }
    public int size(){
    	return top;
    }
    public boolean isEmpty(){
    	return (top==-1);
    }
    public boolean isFull(){
    	return (top==maxSize-1);
    }
}
